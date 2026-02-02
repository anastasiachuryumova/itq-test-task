package itq.test.task.service;

import itq.test.task.dto.DocumentDto;
import itq.test.task.dto.SubmitDocumentDto;
import itq.test.task.entity.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import itq.test.task.entity.enums.Status;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

public interface DocumentService {

    Document create();

    DocumentDto entityToDto(Document document);

    Document findById(Long id);

    Page<Document> findAll(Pageable pageable, List<Long> idList);

    List<DocumentDto> entitiesToDtos(List<Document> documents);

    List<SubmitDocumentDto> submit(List<Long> ids);

    List<Document> findByStatusAuthorDate(Status status, Optional<String> author, Optional<ZonedDateTime> startDate, Optional<ZonedDateTime> endDate);

    Document update(Document document);
}
