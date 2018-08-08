package demo2.contactapp.com.contactappdemo2.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo2.contactapp.com.contactappdemo2.R;
import demo2.contactapp.com.contactappdemo2.model.Contact;
//Ke thua den ArrayAdapter<class model>
public class ContactAdapter extends ArrayAdapter<Contact> {
//khai bao cac bien
    private Context context;
    private int resources;
    private List<Contact> arrayContact;

    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        //lay cac bien da khai bao o tren de gan tiep cho phu hop voi cac tham so truyen vao cua ham public ContactAdapter gom co Context , int , List<>
        this.arrayContact=objects;
        this.context=context;
        this.resources=resource;
    }

    @NonNull
    @Override
    //Khoi tao bien View getView de custom listview
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Viewholder viewholder;

        if (convertView == null){
            viewholder = new Viewholder();
            convertView= LayoutInflater.from(context).inflate(R.layout.row_listview_contact,parent,false);
            viewholder.imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
            viewholder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewholder.tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
            convertView.setTag(viewholder);
        }
        else {
            viewholder = (Viewholder)convertView.getTag();
        }
        //truyen du lieu vao adapter

        Contact contact = arrayContact.get(position);

        viewholder.tvName.setText(contact.getmName());
        viewholder.tvPhone.setText(contact.getmPhone());

        if (contact.isMale()){
            viewholder.imgAvatar.setBackgroundResource(R.drawable.ic_male);
        }else {
            viewholder.imgAvatar.setBackgroundResource(R.drawable.ic_female);
        }

        return super.getView(position, convertView, parent);
    }
//tao 1 class Viewholder de may ko bi load lag nua (theo tren mang la the )
     class Viewholder {
        ImageView imgAvatar;
        TextView tvName;
        TextView tvPhone;
    }
}
