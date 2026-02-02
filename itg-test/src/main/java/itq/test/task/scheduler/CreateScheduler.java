package itq.test.task.scheduler;

import itq.test.task.entity.Document;
import itq.test.task.service.DocumentService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class CreateScheduler {

    private final DocumentService documentService;

    @Value("${number}")
    Integer number;

    public CreateScheduler(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostConstruct
    public void init() {
    }

    @Scheduled(cron = "0 * * * * *")
    //@Transactional
    protected void create() {

        for (int i = 0; i <= number; i++){
            Document document = documentService.create();
            log.info("Создан документ с id {}", document.getId().toString());
        }
    }
}
