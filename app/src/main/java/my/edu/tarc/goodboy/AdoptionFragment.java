package my.edu.tarc.goodboy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdoptionFragment extends Fragment {

    RadioGroup radioGroupAdoption;
    RadioButton radioButtonBreed;
    RadioButton radioButtonOrganization;

    public AdoptionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adoption, container, false);

        radioGroupAdoption = view.findViewById(R.id.radioGroupAdoption);
        radioButtonBreed = view.findViewById(R.id.radioButtonBreed);
        radioButtonOrganization = view.findViewById(R.id.radioButtonOrganization);



        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.floatingActionButtonAddDog);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getActivity().setTitle("AddDog");

                FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager1.beginTransaction();

                AddDogFragment addDogFragment = new AddDogFragment();

                fragmentTransaction.replace(R.id.fragment_content,addDogFragment);

                fragmentTransaction.commit();
            }
        });

        return view;
    }

    public void onSearch()
    {
        if(radioGroupAdoption.getCheckedRadioButtonId() == radioButtonBreed.getId())
        {
            //Search by adoption
        }
        else if(radioGroupAdoption.getCheckedRadioButtonId() == radioButtonOrganization.getId())
        {
            //search by organization
        }
    }
}
