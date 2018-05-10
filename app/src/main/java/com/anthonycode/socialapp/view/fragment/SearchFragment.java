package com.anthonycode.socialapp.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anthonycode.socialapp.R;
import com.anthonycode.socialapp.adapter.PictureAdapterRecyclerView;
import com.anthonycode.socialapp.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        showToolBar("",false,view);
        RecyclerView searchPicturesRecycler = (RecyclerView) view.findViewById(R.id.searchPictureRecycler);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        searchPicturesRecycler.setLayoutManager(gridLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture,getActivity());
        searchPicturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }
    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://img.huffingtonpost.com/asset/570d0dd4150000ad000b4a23.jpeg?cache=6eo3u4uhpa&ops=scalefit_720_noupscale","Uriel Rammirez","4 dias","3 Me gusta"));
        pictures.add(new Picture("http://www.skateboardtricksforbeginners.com/wp-content/uploads/2012/02/crooked-grind.jpg","Juan Pablo","3 dias","10 Me gusta"));
        pictures.add(new Picture("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRRfCR7AGcSgIRCpVATClJHcBFHdD9dsT6Mrmnkj8gfkaYFo-u","Anahi Salgado","2 dias","9 Me gusta"));
        pictures.add(new Picture("https://img.huffingtonpost.com/asset/570d0dd4150000ad000b4a23.jpeg?cache=6eo3u4uhpa&ops=scalefit_720_noupscale","Uriel Rammirez","4 dias","3 Me gusta"));
        pictures.add(new Picture("http://www.skateboardtricksforbeginners.com/wp-content/uploads/2012/02/crooked-grind.jpg","Juan Pablo","3 dias","10 Me gusta"));
        pictures.add(new Picture("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRRfCR7AGcSgIRCpVATClJHcBFHdD9dsT6Mrmnkj8gfkaYFo-u","Anahi Salgado","2 dias","9 Me gusta"));
        return pictures;
    }
    public void showToolBar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbarsearch);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
