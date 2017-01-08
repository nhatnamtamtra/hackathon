package com.f4.letparty.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.f4.letparty.model.*;

import java.util.List;

/**
 * Created by nhatn on 1/8/2017.
 */

public class InvitationAdapter extends ArrayAdapter<Invitation>{
    public InvitationAdapter(Context context, int resource) {
        super(context, resource);
    }

    public InvitationAdapter(Context context, int resource, List<Invitation> objects) {
        super(context, resource, objects);
    }
}
