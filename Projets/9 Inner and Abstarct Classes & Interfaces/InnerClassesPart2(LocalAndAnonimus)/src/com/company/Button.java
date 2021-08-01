package com.company;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    //constructor
    public Button(String title) {
        this.title = title;
    }
//getter
    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick (String title);
    }

}
