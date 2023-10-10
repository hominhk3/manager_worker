package controller;

import common.Library;
import view.Menu;
import common.Algorithms;
import model.History;
import model.Worker;
import java.util.ArrayList;

public class WorkerManagement extends Menu<String> {

    ArrayList<Worker> lw = new ArrayList<>();
    ArrayList<History> lh = new ArrayList<>();

    static String[] mc = {"Add a Worker", "Increase salary for worker",
        "Decrease for worker", "Show adjusted salary worker information", "exit"};

    protected Library library;
    protected Algorithms algorithm;

    public WorkerManagement() {
        super("MANAGE WORKER", mc);
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.addWorker(lw);
                break;
            case 2:
                algorithm.changeSalary(lw, lh, 1);
                break;
            case 3:
                algorithm.changeSalary(lw, lh, 2);
                break;
            case 4:
                algorithm.printListHistory(lh);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}