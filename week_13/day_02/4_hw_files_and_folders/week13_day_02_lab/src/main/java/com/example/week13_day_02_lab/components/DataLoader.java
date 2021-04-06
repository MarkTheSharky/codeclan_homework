package com.example.week13_day_02_lab.components;

import com.example.week13_day_02_lab.models.File;
import com.example.week13_day_02_lab.models.Folder;
import com.example.week13_day_02_lab.models.User;
import com.example.week13_day_02_lab.repositories.FileRepository;
import com.example.week13_day_02_lab.repositories.FolderRepository;
import com.example.week13_day_02_lab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User mark = new User("Mark");
        userRepository.save(mark);

        User sweeney = new User("Sweeney");
        userRepository.save(sweeney);

        Folder folder1 = new Folder("folder1", mark);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("folder2", sweeney);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("folder3", mark);
        folderRepository.save(folder3);

        File file1 = new File("file1", ".txt", 20, folder1);
        fileRepository.save(file1);

        File file2 = new File("file2", ".py", 56, folder2);
        fileRepository.save(file2);

        File file3 = new File("file3", ".js", 100, folder1);
        fileRepository.save(file3);
    }
}
