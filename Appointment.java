public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;

    public Appointment(int appointmentId,
                       Patient patient,
                       Doctor doctor,
                       String appointmentDate) {

        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {

        return "\nAppointment ID : " + appointmentId +
               "\nPatient : " + patient.getPatientName() +
               "\nDoctor : " + doctor.getDoctorName() +
               "\nDate : " + appointmentDate;
    }
}