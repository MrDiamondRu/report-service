package ru.rtk.service.reportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtk.service.reportservice.model.Folder;
import ru.rtk.service.reportservice.model.Volume;

import java.util.List;
import java.util.UUID;

/**
 * Интерфейс репозитория томов дела
 *
 * @author rnikonov
 */
public interface VolumeRepository extends JpaRepository<Volume, UUID> {

    /**
     * Метод поиска томов по делу с сортировкой
     *
     * @param folder дело
     * @return список томов
     */
    List<Volume> findByFolderOrderByNumberDesc(Folder folder);

    /**
     * Метод поиска томов по делу с сортировкой
     *
     * @param folder дело
     * @return список томов
     */
    List<Volume> findByFolder(Folder folder);
}
