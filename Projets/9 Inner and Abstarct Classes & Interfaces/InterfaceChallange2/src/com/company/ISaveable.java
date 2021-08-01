package com.company;

import java.util.List;

public interface ISaveable {
     List<String> saveInToTheList ();
     void readFromTheList(List<String> savedValues);
}
