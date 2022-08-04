package com.rikaaadila.a10119186uts;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rikaaadila.a10119186uts.R;
import java.util.ArrayList;

public class DailyFragment extends Fragment {

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        //daily
        recyclerViewDaily = root.findViewById(R.id.recyclerView);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.sleeping, "Sleeping", "Istirahat");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.movie, "Watch a Movie", "Menonton Film/Series");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.rika4, "Dating", "jalan-jalan sama doi");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.belajar, "Study", "doing homework");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.meeting, "Meeting", "Rapat Organisasi");
        dailyModel.add(daily5);

        recyclerViewDaily.setAdapter(new AdapterDaily(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.recyclerView2);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendModel fl1 = new FriendModel(R.drawable.foto_yolan, "Yolanda Octaviane");
        friendlistModel.add(fl1);
        FriendModel fl2 = new FriendModel(R.drawable.foto_meli, "Meli Nurcahyani");
        friendlistModel.add(fl2);
        FriendModel fl3 = new FriendModel(R.drawable.foto_luthfia, "Luthfia Yunizar Rissane");
        friendlistModel.add(fl3);
        FriendModel fl4 = new FriendModel(R.drawable.foto_sarah, "Sarah Meliniar");
        friendlistModel.add(fl4);
        FriendModel fl5 = new FriendModel(R.drawable.foto_ghea, "Ghea Rizqi Nabilla");
        friendlistModel.add(fl5);

        recyclerViewFriendlist.setAdapter(new AdapterFriend(friendlistModel));

        return root;
    }
}