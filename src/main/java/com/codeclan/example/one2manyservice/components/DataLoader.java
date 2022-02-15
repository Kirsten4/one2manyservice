package com.codeclan.example.one2manyservice.components;

import com.codeclan.example.one2manyservice.models.File;
import com.codeclan.example.one2manyservice.models.Folder;
import com.codeclan.example.one2manyservice.models.User;
import com.codeclan.example.one2manyservice.repositories.FileRepository;
import com.codeclan.example.one2manyservice.repositories.FolderRepository;
import com.codeclan.example.one2manyservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Kirsten");
        userRepository.save(user1);
        User user2 = new User("David");
        userRepository.save(user2);

        Folder folder1 = new Folder("User1_Documents", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("User1_Downloads", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("User2_Documents", user2);
        folderRepository.save(folder3);

        File file1 = new File("File_1", "txt", 10.4, folder1);
        fileRepository.save(file1);
        File file2 = new File("File_2", "jpeg", 7.2, folder1);
        fileRepository.save(file2);
        File file3 = new File("File_3", "txt", 10.4, folder2);
        fileRepository.save(file3);
        File file4 = new File("File_4", "jpeg", 7.2, folder2);
        fileRepository.save(file4);

    }
}
