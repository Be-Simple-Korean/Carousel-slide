package com.example.vpfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentFirst extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
      ViewGroup rootView = (ViewGroup) inflater.inflate(
              R.layout.fragment_1p, container, false);
 
      return rootView;
  }
}