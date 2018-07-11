package com.example.abdu.egypttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PyramidsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.itemlist, container, false);

        ArrayList<LocationItem> items = new ArrayList<>();
        items.add(new LocationItem(getString(R.string.museum), getString(R.string.museumdetails), R.drawable.museum));
        items.add(new LocationItem(getString(R.string.museum1), getString(R.string.museum1details), R.drawable.mummy));
        items.add(new LocationItem(getString(R.string.museum2), getString(R.string.museum2details), R.drawable.statue));

        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.itemlist);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
