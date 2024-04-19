package ru.rtk.service.reportservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Журнал
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Journal {
    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Тип работ
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private WorkType workType;

    /**
     * Дата начала
     */
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfStart;

    /**
     * Дата формирования
     */
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate dateOfFormation;

    /**
     * Печатался ли журнал
     */
    private Boolean printing;

    /**
     * Готовность журнала к печати
     */
    private Boolean ready;

    /**
     * Маркер автоматически генерируемых журналов
     */
    private Boolean auto;

    /**
     * Количество страниц
     */
    private Integer pageCount;

    /**
     * Конструктор для создания нового автоматически наполняемого журнала
     *
     * @param workType тип работ
     * @param dateOfFormation дата формирования журнала
     */
    public Journal(WorkType workType, LocalDate dateOfFormation) {
        this.pageCount = 0;
        this.printing = false;
        this.ready = false;
        this.auto = true;
        this.workType = workType;
        this.dateOfFormation = dateOfFormation;
    }
}
