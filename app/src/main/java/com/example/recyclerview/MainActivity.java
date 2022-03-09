package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;
    String[] programNameList = {"MS-Access", "MS-Excel", "MS-InfoPath", "MS-OneDrive", "MS-OneNote", "MS-OutLook",
            "MS-PowerPoint", "MS-Project", "MS-Publisher", "MS-SharePoint", "MS-Visual-Studio", "MS-Word"};
    String[] programDescriptionList = {"DB Management System", "Display Calculate & Manipulation Data",
            "Design Forms & Questionairs", "Data Storage", "Digital Notebook", "Send & Recieve Emails",
            "Slides & Presentations", "Project Management", "Design Cards & Calenders", "Document Sharing/Management",
            "IDE for Software Development", "Create & Edit Documents"};
    int[] programImages = {R.drawable.access, R.drawable.excel, R.drawable.infopath, R.drawable.onedrive,
            R.drawable.onenote, R.drawable.outlook, R.drawable.powerpoint, R.drawable.project, R.drawable.publisher,
            R.drawable.sharepoint, R.drawable.visualstudio, R.drawable.word};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImages);
        recyclerView.setAdapter(programAdapter);
    }
}