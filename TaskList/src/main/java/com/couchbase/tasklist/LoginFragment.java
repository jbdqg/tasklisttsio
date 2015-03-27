package com.couchbase.tasklist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

import com.facebook.widget.LoginButton;

public class LoginFragment extends Fragment {

    public LoginButton mLoginButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        mLoginButton = (LoginButton) view.findViewById(R.id.authButton);
        mLoginButton.setReadPermissions(Arrays.asList("email"));

        return view;
    }
}
