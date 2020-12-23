package com.code4ro.legalconsultation.document.metadata.model.persistence;

import com.code4ro.legalconsultation.core.model.persistence.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "document_description")
@Getter
@Setter
public class DocumentMetadata extends BaseEntity {

    @Column(name = "document_number", unique=true, nullable=false)
    private BigInteger documentNumber;

    @Column(name = "document_title", nullable=false)
    private String documentTitle;

    @Column(name = "document_initializer", nullable=false)
    private String documentInitializer;

    @Column(name = "document_type")
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;

    @Column(name = "date_of_development", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dateOfDevelopment;

    @Column(name = "date_of_receipt", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dateOfReceipt;

    @Column(name = "file_path", unique = true, nullable = false)
    private String filePath;
}
