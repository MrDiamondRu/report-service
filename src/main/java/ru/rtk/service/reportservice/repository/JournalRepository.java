package ru.rtk.service.reportservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rtk.service.reportservice.model.Journal;
import ru.rtk.service.reportservice.model.WorkType;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * Интерфейс репозитория журналов
 *
 * @author rnikonov
 */
public interface JournalRepository extends JpaRepository<Journal, UUID> {

    /**
     * Метод поиска журналов по типу работ и дате формирования
     *
     * @param workType             тип работ
     * @param dateOfFormationStart дата начала формирования
     * @param dateOfFormationEnd   дата окончания формирования
     * @return список журналов
     */
    List<Journal> findByWorkTypeAndDateOfFormationBetweenOrderByDateOfFormationAsc(WorkType workType, LocalDate dateOfFormationStart, LocalDate dateOfFormationEnd);

}
