package com.example.homework_message_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.homework_message_listview.Model.Message;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Message> messages = new ArrayList<>();
    ListView listView;
    int images[] = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15,
    };
    String names[] = {
            "Joe",
            "Zed",
            "Lee",
            "Happy",
            "John",
            "Jack",
            "Kenny",
            "Simple",
            "Niko",
            "Device",
            "Rain",
            "Shox",
            "Guardian",
            "Heng",
            "Chhay",
            "Seng",
    };
    String times[] = {
            "2:02",
            "12:54",
            "5:32",
            "8:23",
            "4:15",
            "9:21",
            "10:53",
            "11:00",
            "3:30",
            "5:50",
            "1:53",
            "6:30",
            "7:30",
            "9:20",
            "11:11",
            "12:12",
    };
    String text_Messages[] = {
            "Joe’s Auto Repair is having a Buy 3 Get 1 Free tyre sale until the end of July. Visit Joe’s Auto Repair today on 21st Street for sizes and prices.",
            "Receive discounts on tasty lunch specials. Text “LUNCH” to 777-343-555 and get a 2% discount on your next order! Your Daily Food.",
            "Keep the kids happy this summer with free entry to the Paintball Centre throughout the whole of August. Call us back to book a date: 555-4545-777.",
            "No more running out of the office at 4pm on Fridays to find a new dress! Lucy’s Closet is now open until 8pm. Find your closest store: lucy.com/stores.",
            "All your favourite books at your reach! Gottingham Bookstore is now mobile. Best deals for 3 days only, hurry up: m.bookstore.com.",
            "Be the first to know about discounts and offers at Bethany Beauty! Click here to subscribe: store.com/coupons-deals.",
            "Hair Salon appointment reminder: haircut tomorrow at 10:30am with Charles. Any questions please call 0161 5555555.",
            "Your dental appointment with Dr P. Delvour is scheduled for October 29, 4:00pm. ABC Dentist, 555-555-555.",
            "Trusted Bank reminds you of your appointment at 23 Newington Way on Monday, 13th of August at 10:00am. Your account manager is Timothy Jackson, phone 0748379393.",
            "Dear Deborah, your Thai massage is today at 5pm. Please come 10 min earlier. Your Thai Massage Salon.",
            "Susan from Private Real Estate will show you the property on Thursday at 2pm. Please reply to this number if you need to change the time.",
            "You are invited to the interview at PY Finance at 10am this Wednesday on 21 Clarkwell Road. Please call back on this number in case of problems. Sally from PY Finance HR.",
            "Your package AX-484-555 is delivered to 21 Layson Street Post Office. Your SLN Logistics.",
            "ABC Electronics: your television has been dispatched. Expected time of arrival: 3–5pm on 4 March. If you are not home at that time, please call 0161 5555555 or reply to this text.",
            "Your money is being processed! Please note it may take up to 2 hours for the funds to appear. BC Building Society.",
            "Dear Matt. Your flight 349033 will be delayed for 2 hours. Please contact Lufthansa for further information. We are sorry for any inconvenience.",
    };

    void initMessage() {
        messages.add(new Message(names[0], text_Messages[0], times[0], images[0]));
        messages.add(new Message(names[1], text_Messages[1], times[1], images[1]));
        messages.add(new Message(names[2], text_Messages[2], times[2], images[2]));
        messages.add(new Message(names[3], text_Messages[3], times[3], images[3]));
        messages.add(new Message(names[4], text_Messages[4], times[4], images[4]));
        messages.add(new Message(names[5], text_Messages[5], times[5], images[5]));
        messages.add(new Message(names[6], text_Messages[6], times[6], images[6]));
        messages.add(new Message(names[7], text_Messages[7], times[7], images[7]));
        messages.add(new Message(names[8], text_Messages[8], times[8], images[8]));
        messages.add(new Message(names[9], text_Messages[9], times[9], images[9]));
        messages.add(new Message(names[10], text_Messages[10], times[10], images[10]));
        messages.add(new Message(names[11], text_Messages[11], times[11], images[11]));
        messages.add(new Message(names[12], text_Messages[12], times[12], images[12]));
        messages.add(new Message(names[13], text_Messages[13], times[13], images[13]));
        messages.add(new Message(names[14], text_Messages[14], times[14], images[14]));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Message");
        initMessage();
        listView = findViewById(R.id.list_View);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Message selectedMessage = messages.get(position);

                Intent intent = new Intent(getApplicationContext(), Message_InfoActivity.class);
                intent.putExtra("IMAGE", selectedMessage.getImage());
                intent.putExtra("NAME", selectedMessage.getName());
                intent.putExtra("TEXTMESSAGE", selectedMessage.getTextmessage());
                intent.putExtra("TIME", selectedMessage.getTime());
                startActivity(intent);
            }
        });
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = null;
            if (convertView != null)
                view = convertView;
            else view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_listview,parent,false);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView name = view.findViewById(R.id.tv_Name);
            TextView time = view.findViewById(R.id.tv_Time);
            TextView text_Message = view.findViewById(R.id.tv_textMessage);

            imageView.setImageResource(messages.get(position).getImage());
            name.setText(messages.get(position).getName());
            text_Message.setText(messages.get(position).getTextmessage());
            time.setText(messages.get(position).getTime());
            return view;
        }
    }
}
