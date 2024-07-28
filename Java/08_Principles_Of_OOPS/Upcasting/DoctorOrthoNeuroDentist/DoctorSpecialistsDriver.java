package Upcasting.DoctorOrthoNeuroDentist;

public class DoctorSpecialistsDriver {
	
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.checkPulse();
		doctor.checkBP();
		doctor.checkTemp();
		System.out.println("---------------------------");
		
		// Upcasting - Orthopedic,Neurologist,Dentist is a Doctor (IS-A Relationship) 
		// Generalization Example
		
        Doctor ortho = new Orthopedic();
        ortho.checkPulse();
        ortho.checkBP();
        ortho.checkTemp();
        // ortho.checkXRay(); // CTE
        // ortho.checkBoneDensity(); // CTE
        // ortho.checkCTScan(); // CTE
        System.out.println("---------------------------");
        
        Doctor neuro = new Neurologist();
        neuro.checkPulse();
        neuro.checkBP();
        neuro.checkTemp();
        // neuro.checkMRI(); // CTE
        // neuro.checkEEG(); // CTE
        // neuro.checkEMG(); // CTE
        System.out.println("---------------------------");
        
        Doctor dentist = new Dentist();
        dentist.checkPulse();
        dentist.checkBP();
        dentist.checkTemp();
        // dentist.checkTeeth(); // CTE
        // dentist.checkGums(); // CTE
        // dentist.checkPlaque(); // CTE
        System.out.println("---------------------------");
        
	}

}
