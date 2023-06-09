package cts.s02.principii_clean_code.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

public class StudentReader extends AplicantReader {

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<>();

		while (input.hasNext()) {
			Student student=new Student();
			super.readAplicant(input, student);
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		input.close();
		return studenti;
	}

}
