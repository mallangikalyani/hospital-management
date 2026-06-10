import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalService hospital = new HospitalService();

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Patient ID: ");
                        int pid = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Patient Name: ");
                        String pname = sc.nextLine();

                        System.out.print("Age: ");
                        int age = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Disease: ");
                        String disease = sc.nextLine();

                        Patient patient =
                                new Patient(
                                        pid,
                                        pname,
                                        age,
                                        disease);

                        hospital.addPatient(patient);
                        break;

                    case 2:

                        System.out.print("Doctor ID: ");
                        int did = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Doctor Name: ");
                        String dname = sc.nextLine();

                        System.out.print("Specialization: ");
                        String specialization = sc.nextLine();

                        Doctor doctor =
                                new Doctor(
                                        did,
                                        dname,
                                        specialization);

                        hospital.addDoctor(doctor);
                        break;

                    case 3:
                        hospital.viewPatients();
                        break;

                    case 4:
                        hospital.viewDoctors();
                        break;

                    case 5:

                        System.out.print("Appointment ID: ");
                        int aid = sc.nextInt();

                        System.out.print("Patient ID: ");
                        int patientId = sc.nextInt();

                        System.out.print("Doctor ID: ");
                        int doctorId = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Appointment Date: ");
                        String date = sc.nextLine();

                        hospital.bookAppointment(
                                aid,
                                patientId,
                                doctorId,
                                date);

                        break;

                    case 6:
                        hospital.viewAppointments();
                        break;

                    case 7:
                        System.out.println("Thank You!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (HospitalException e) {

                System.out.println(
                        "Error: " + e.getMessage());
            }
        }
    }
}