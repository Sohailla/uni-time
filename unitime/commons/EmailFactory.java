import org.unitime.commons.EmailService;

public class EmailFactory {
    public static EmailService createEmailService() throws Exception {
        return (EmailService) Class.forName(ApplicationProperty.EmailProvider.value())
                .getDeclaredConstructor().newInstance();
    }
}