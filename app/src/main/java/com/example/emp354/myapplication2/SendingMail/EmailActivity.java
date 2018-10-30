package com.example.emp354.myapplication2.SendingMail;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emp354.myapplication2.R;

public class EmailActivity extends AppCompatActivity implements View.OnClickListener{


    EditText etFrom,etTo,etSubject,etBody,etCC;
    Button btnSend,btnAttachment;
    private static final int PICK_FROM_GALLERY = 101;
    int columnIndex;
    String attachmentFile;
    Uri URI = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        etFrom=findViewById(R.id.et_mail_from);
        etTo=findViewById(R.id.et_mail_to);
        etSubject=findViewById(R.id.et_mail_subject);
        etBody=findViewById(R.id.et_mail_body);
        etCC=findViewById(R.id.et_mail_cc);
        btnSend=findViewById(R.id.btn_send);
        btnAttachment=findViewById(R.id.btn_attachment);

        btnSend.setOnClickListener(this);
        btnAttachment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_send:
                sendEmail();
                break;


            case R.id.btn_attachment:
                openFolder();
                break;
        }
    }
    private void sendEmail()
    {

        String[] TO={etTo.getText().toString()};
        String[] CC={etCC.getText().toString()};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, etSubject.getText().toString());
        emailIntent.putExtra(Intent.EXTRA_TEXT, etBody.getText().toString());

        if(URI!=null)
        {
            emailIntent.putExtra(Intent.EXTRA_STREAM, URI);
        }


        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(EmailActivity.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
     }


    public void openFolder()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.putExtra("return-data", true);
        startActivityForResult(Intent.createChooser(intent, "Complete action using"), PICK_FROM_GALLERY);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == PICK_FROM_GALLERY && resultCode == RESULT_OK) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
            Cursor cursor = getContentResolver().query(selectedImage,filePathColumn, null, null, null);
            cursor.moveToFirst();
            columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            attachmentFile = cursor.getString(columnIndex);
           /* Log.e("Attachment Path:", attachmentFile);*/
            URI = Uri.parse("file://" + attachmentFile);
            cursor.close();
        }
    }

}
