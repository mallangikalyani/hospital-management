import java.util.ArrayList;

public class HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void viewPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient patient : patients) {
            System.out.println("\n------------------");
            System.out.println(patient);
        }
    }

    public void viewDoctors() {

        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        for (Doctor doctor : doctors) {
            System.out.println("\n------------------");
            System.out.println(doctor);
        }
    }

    public void bookAppointment(int appointmentId,
                                int patientId,
                                int doctorId,
                                String date)
            throws HospitalException {

        Patient selectedPatient = null;
        Doctor selectedDoctor = null;

        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                selectedPatient = patient;
                break;
            }
        }

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                selectedDoctor = doctor;
                break;
            }
        }

        if (selectedPatient == null) {
            throw new HospitalException("Patient not found.");
        }

        if (selectedDoctor == null) {
            throw new HospitalException("Doctor not found.");
        }

        Appointment appointment =
                new Appointment(
                        appointmentId,
                        selectedPatient,
                        selectedDoctor,
                        date);

        appointments.add(appointment);

        System.out.println("Appointment booked successfully.");
    }

    public void viewAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment appointment : appointments) {
            System.out.println("\n------------------");
            System.out.println(appointment);
        }
    }
}