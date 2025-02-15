package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.DadosItens;

public class ProgramFile {

	public static void main(String[] args) {

		String pathSource = "c:\\temp\\ws-eclipse\\atividades_files_java\\dirExe\\source.csv";
		String pathOutput = "c:\\temp\\ws-eclipse\\atividades_files_java\\dirExe\\out\\summary.csv";

		List<DadosItens> items = new ArrayList<>();
		List<String> results = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathSource))) {

			String line = br.readLine();

			while (line != null) {
				String[] lineSplitted = line.split(",");

				System.out.println(line);

				String name = lineSplitted[0];
				Double price = Double.parseDouble(lineSplitted[1]);
				Integer qty = Integer.parseInt(lineSplitted[2]);

				items.add(new DadosItens(name, price, qty));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (DadosItens item : items) {
			Double valTotal = item.valorTotal();
			results.add(item.getNome().concat("," + valTotal.toString()));
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOutput))) {
			for (String result : results) {
				bw.write(result);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void files() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a path:");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Folders:");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}

		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();

	}

	public static void writers() {

		String[] lines = new String[] {"Maria"};
		
		String path = "c:\\temp\\ws-eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void readers() {
		String path = "c:\\temp\\ws-eclipse\\file.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public static void fileScannerPattern() {
		File file = new File("c:\\temp\\ws-eclipse\\file.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
