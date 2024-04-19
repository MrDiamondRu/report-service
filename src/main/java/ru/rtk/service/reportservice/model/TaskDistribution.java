package ru.rtk.service.reportservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

/**
 * Распределение заданий
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDistribution {
    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Идентификатор записи в БД
     */
    private Integer jobId;

    /**
     * Журнал
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Journal journal;

    /**
     * Том дела
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Volume volume;

    /**
     * Номер строки в журнале
     */
    private Integer rowNum;

    /**
     * Номер страницы в деле
     */
    private Integer casePageNum;
}
