package com.chernenko.alexey.musicapp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chernenko.alexey.musicapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by saion on 02.01.2016.
 */
public class FragmentMusicList extends Fragment {
    @Bind(R.id.track_list)
    RecyclerView trackList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_list, container, false);
        ButterKnife.bind(this, getActivity());

        return view;
    }

    private void initList() {
    }
}
