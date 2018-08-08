package demo2.contactapp.com.contactappdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import demo2.contactapp.com.contactappdemo2.Adapter.ContactAdapter;
import demo2.contactapp.com.contactappdemo2.model.Contact;

public class MainActivity extends AppCompatActivity {

    private Button btnAddcontact;
    private ListView lv_contact;
    private ContactAdapter customadapter;
    private List<Contact> arrayContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddcontact = (Button)findViewById(R.id.btnAddcontact);
        //khoi tao cac adapter
        arrayContact = new ArrayList<>();
        customadapter = new ContactAdapter(this,R.layout.row_listview_contact,arrayContact);
        lv_contact.setAdapter(customadapter);//khoi tao thanh cong adapter
        //set click tren listview
        lv_contact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                showDetailContact(position);
            }
        });
        btnAddcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            //set su kien cho nut addcontact
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddContactActivity.class);
                startActivity(intent);
            }
        });
    }
    private void showDetailContact( final int position) {
            Intent intent = new Intent(MainActivity.this,ShowDetailContact.class);
            startActivity(intent);
    }
}
