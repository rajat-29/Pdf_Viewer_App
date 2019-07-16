package com.example.pdf_viewer;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PDFAdapter extends ArrayAdapter<File> {

    Context context;
    ViewHolder viewHolder;
    ArrayList<File> all_pdf;

    public PDFAdapter(Context context, ArrayList<File> all_pdf) {
        super(context, resource);

        this.context = context;
        this.all_pdf = all_pdf;
    }

    public PDFAdapter(Context context, int resource, int textViewResourceId, Context context1, ViewHolder viewHolder, ArrayList<File> all_pdf) {
        super(context, resource, textViewResourceId);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.all_pdf = all_pdf;
    }

    public PDFAdapter(Context context, int resource, File[] objects, Context context1, ViewHolder viewHolder, ArrayList<File> all_pdf) {
        super(context, resource, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.all_pdf = all_pdf;
    }

    public PDFAdapter(Context context, int resource, int textViewResourceId, File[] objects, Context context1, ViewHolder viewHolder, ArrayList<File> all_pdf) {
        super(context, resource, textViewResourceId, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.all_pdf = all_pdf;
    }

    public PDFAdapter(Context context, int resource, List<File> objects, Context context1, ViewHolder viewHolder, ArrayList<File> all_pdf) {
        super(context, resource, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.all_pdf = all_pdf;
    }

    public PDFAdapter(Context context, int resource, int textViewResourceId, List<File> objects, Context context1, ViewHolder viewHolder, ArrayList<File> all_pdf) {
        super(context, resource, textViewResourceId, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.all_pdf = all_pdf;
    }

    public class ViewHolder
    {
        TextView tv_filename;
    }
}
