package payroll;

import org.hl7.fhir.r4.model.Patient;
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

		Patient patient = new Patient();
		patient.addName().addGiven("Atanu").setFamily("Pandit");
		patient.setActive(true);
		patient.setGender(AdministrativeGender.MALE);
		patient.addTelecom().setSystem(ContactPointSystem.PHONE).setValue("1234567890");

		MethodOutcome outcome = client.create().resource(patient).prettyPrint().encodedJson().execute();

		// String jsonPatient = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(patient);

		System.out.println(ctx.newJsonParser().encodeResourceToString(outcome.getResource()));
	}
}
