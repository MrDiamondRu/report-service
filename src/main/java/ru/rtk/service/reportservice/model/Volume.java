package ru.rtk.service.reportservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

/**
 * Том дела
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Volume {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Тип ОТМ
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Folder folder;

    /**
     * Номер
     */
    private Integer number;

    /**
     * Количество страниц
     */
    private Integer pageCount;

    /**
     * Актуальность
     */
    private Boolean active;

    /**
     * Конструктор создания пустого тома
     *
     * @param folder дело
     * @param number номер тома
     */
    public Volume(Folder folder, Integer number) {
        this.folder = folder;
        this.number = number;
        this.pageCount = 0;
        this.active = true;
    }
}
