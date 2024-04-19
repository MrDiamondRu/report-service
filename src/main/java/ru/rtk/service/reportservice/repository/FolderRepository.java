package ru.rtk.service.reportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtk.service.reportservice.model.Folder;
import ru.rtk.service.reportservice.model.WorkType;

import java.util.UUID;

/**
 * Интерфейс репозитория дела
 *
 * @author rnikonov
 */
public interface FolderRepository extends JpaRepository<Folder, UUID> {

    /**
     * Метод поиска дела по типу работ и году
     *
     * @param workType тип работ
     * @param year год
     * @return дело
     */
    Folder findByWorkTypeAndYear(WorkType workType, Integer year);

    /**
     * Метод удаления дел по типу работ
     *
     * @param workType
     */
    void deleteByWorkType(WorkType workType);
}
