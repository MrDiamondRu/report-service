package ru.rtk.service.reportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtk.service.reportservice.model.Journal;
import ru.rtk.service.reportservice.model.TaskDistribution;
import ru.rtk.service.reportservice.model.Volume;

import java.util.List;
import java.util.UUID;

/**
 * Интерфейс репозитория распределения заданий
 *
 * @author rnikonov
 */
public interface TaskDistributionRepository extends JpaRepository<TaskDistribution, UUID> {
    /**
     * Метод поиска заданий по журналу
     *
     * @param journal журнал
     * @return список заданий
     */
    List<TaskDistribution> findByJournal(Journal journal);

    /**
     * Метод поиска заданий по тому дела
     *
     * @param volume том дела
     * @return список заданий
     */
    List<TaskDistribution> findByVolume(Volume volume);

    /**
     * Метод удаления тома дела
     *
     * @param volume том дела
     */
    void deleteByVolume(Volume volume);
}
