package com.codeclan.example.one2manyservice.repositories;

import com.codeclan.example.one2manyservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
