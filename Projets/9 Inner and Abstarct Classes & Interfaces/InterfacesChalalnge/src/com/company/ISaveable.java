package com.company;

import java.util.List;

public interface ISaveable {
    List<String> write ();                // we can use any type of list in the future
    void read (List<String> savedValues);
}
