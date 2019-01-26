package com.example.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.MyViewHolder>{


    private List<Contact> contacts;

    public RecyclerAdapter(List<Contact> contacts)
    {

        this.contacts=contacts;
    }
    @NonNull
    @Override
    public MyViewHolder  onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {

        viewHolder.Name.setText(contacts.get(i).getName());
        viewHolder.Email.setText(contacts.get(i).getEmail());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Name, Email;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = (TextView)itemView.findViewById(R.id.name);

            Email =(TextView)itemView.findViewById(R.id.email);
        }
    }
}
