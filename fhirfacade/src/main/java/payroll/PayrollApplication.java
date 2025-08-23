package payroll;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String... args) {
		// SpringApplication.run(PayrollApplication.class, args);

		String baseURL = "http://localhost:8080/fhir";

		FhirContext ctx = FhirContext.forR4();

		IGenericClient client = ctx.newRestfulGenericClient(baseURL);

		Practitioner practitioner = new Practitioner();
		practitioner.addName().addGiven("Robert").setFamily("Brown");
		practitioner.setActive(true);
		practitioner.setGender(AdministrativeGender.MALE);
		practitioner.addTelecom().setSystem(ContactPointSystem.PHONE).setValue("784685188");

		MethodOutcome outcome = client.create().resource(practitioner).prettyPrint().encodedJson().execute();

		// String jsonpractitioner = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(practitioner);

		System.out.println(ctx.newJsonParser().encodeResourceToString(outcome.getResource()));
	}
}
