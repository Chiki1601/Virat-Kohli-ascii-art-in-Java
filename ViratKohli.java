
public class ViratKohli implements Runnable {
    
    public void run() {
       char[][] data={
        {40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,42,40,37,38,64,38,47,47,35,37,38,37,35,40,44,46,46,44,47,47,47,40,64,64,64,64,37,40,42,42,44,46,32,32,32,32,32,32,32,32,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,46,42,44,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,44,32,32,32,32,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32},
        {40,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32},
        {40,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,46,32,46,35,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,47,38,64,47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,46,42,64,64,64,40,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,47,46,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,46,47,40,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,40,46,46,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,42,40,35,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,37,42,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,44,42,38,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,42,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,42,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,42,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,46,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,38,64,64,40,42,46,42,38,38,40,46,32,32,46,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,44,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,35,37,64,64,64,64,64,64,64,64,64,35,47,42,32,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,64,37,46,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,64,64,64,64,38,40,44,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,42,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,47,38,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,42,37,38,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,42,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,35,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,40,46,37,64,64,40,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,42,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,44,32,32,32,42,40,40,44,42,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,40,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,46,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,40,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,42,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,47,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,44,46,32,42,32,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,35,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,47,32,42,47,37,35,44,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,35,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,38,37,38,47,32,42,35,46,42,35,38,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,38,37,32,32,32,32,32,46,47,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,40,44,42,42,64,35,37,64,35,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,32,32,32,32,32,32,32,46,44,42,42,42,35,42,46,32,32,32,32,32,32,32,32,32,32,46,42,40,35,37,38,38,38,38,38,38,38,38,37,40,47,42,44,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,40,44,35,35,64,38,37,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {46,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,35,40,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,64,37,40,64,40,38,37,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,47,44,32,32,32,32,32,32,32,32,35,64,64,64,38,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,47,46,47,40,40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {44,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,42,32,47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,38,38,64,64,64,64,64,64,64,64,64,64,64,64,47,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {46,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,46,32,32,32,47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,42,32,32,44,42,44,32,46,37,64,64,64,64,64,64,64,64,37,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {37,64,64,64,64,64,64,64,64,64,64,64,64,38,42,32,32,32,32,32,32,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,40,44,32,32,32,32,32,32,32,32,32,32,32,32,46,40,64,64,64,64,64,64,64,64,38,40,32,32,32,44,64,64,64,64,64,64,38,46,35,64,64,64,64,64,64,64,44,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,64,64,64,64,64,64,64,35,32,32,32,32,32,32,32,32,46,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,35,38,64,64,64,64,64,35,32,32,32,32,46,64,64,35,46,32,32,32,32,40,38,32,35,64,64,64,64,64,42,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {46,64,64,64,64,64,64,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,38,37,64,64,64,35,32,32,32,32,32,44,64,64,47,32,32,32,32,32,32,32,42,46,42,64,64,64,64,46,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {32,46,35,64,64,64,64,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,44,38,64,64,47,42,32,32,32,32,32,64,38,42,46,32,32,32,32,32,32,32,46,32,44,64,64,64,40,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {47,46,32,32,32,32,32,40,64,37,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,37,37,64,64,47,32,32,32,32,32,32,35,38,37,64,37,32,32,32,32,32,32,32,32,32,40,64,64,42,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,32,32,37,64,42,40,64,35,46,42,64,64,64,64,64,64,40,46,32,32,32,32,46,42,47,40,40,40,40,40,47,47,44,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,44,64,64,64,37,32,32,32,32,32,32,32,44,32,32,46,37,46,32,32,32,32,32,32,32,40,64,64,37,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,32,32,37,64,40,46,37,64,64,64,64,64,47,46,44,47,37,64,37,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,37,38,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,38,44,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,47,64,47,32,32,32,46,37,64,64,32,32,32,32,32,32,44,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,42,47,38,37,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,38,64,64,64,44,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,46,35,32,32,32,46,38,64,64,64,64,42,40,35,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,40,37,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,37,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,47,44,37,64,64,38,64,64,64,42,42,44,35,46,32,42,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,46,47,40,35,38,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,64,64,64,64,38,46,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,42,64,64,47,32,32,46,46,32,32,32,32,32,32,32,32,32,46,40,46,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,37,47,64,64,64,44,32,44,46,32,32,32,32,32,32,32,32,32,32,32,44,64,64,64,64,64,38,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,47,64,38,64,64,64,38,64,64,64,64,64,38,47,46,32,32,32,32,42,35,35,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,47,38,42,64,64,40,42,40,35,32,32,32,32,32,32,32,32,32,47,64,64,64,64,64,64,38,46,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,37,42,37,64,64,40,64,64,47,64,38,44,32,32,32,32,42,35,64,64,64,64,64,64,64,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,35,64,64,40,47,44,46,32,32,32,32,32,32,46,44,35,37,38,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,40,38,37,64,64,38,37,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,47,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,42,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,47,40,32,32,35,47,40,38,64,64,64,64,64,64,38,37,64,64,64,64,64,64,64,64,64,64,64,64,38,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,44,64,38,38,38,38,64,38,47,44,32,32,32,32,32,32,32,32,32,32,32,32,32,47,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,44,64,37,37,35,64,37,64,64,64,64,64,64,64,35,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,44,64,64,64,64,64,64,64,64,64,64,64,64,64,38,42,32,32,32,32,32,32,32,37,37,42,38,46,32,32,32,32,32,32,42,32,44,44,44,32,32,46,40,32,46,37,40,64,64,64,64,38,64,64,64,64,64,64,64,38,46,46,37,64,64,64,64,64,64,64,64,64,47,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,46,64,64,64,64,64,64,64,64,64,64,64,35,42,46,32,32,32,32,42,37,47,38,37,35,64,64,38,46,46,32,40,40,40,64,38,37,64,47,40,40,44,32,42,38,64,35,64,64,35,64,64,64,64,64,64,64,64,64,46,32,32,32,44,38,64,64,64,64,64,64,40,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,46,64,64,64,64,38,44,32,32,32,32,32,46,38,64,35,42,38,40,64,47,32,42,64,64,64,64,64,38,64,64,38,40,64,64,38,47,64,64,37,38,37,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,32,32,32,32,42,64,64,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,64,64,64,64,64,38,64,64,37,35,37,35,38,37,64,35,44,40,64,35,37,64,64,64,64,64,64,64,64,64,64,64,64,38,64,64,64,64,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,32,32,32,32,32,32,32,32,44,40,64,64,64,38,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,38,64,64,64,64,64,64,64,64,64,64,64,37,37,64,64,64,37,64,64,64,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,32,32,32,46,47,38,64,64,38,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,47,35,64,64,38,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,47,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,46,32,46,42,42,38,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,46,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,40,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,44,40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,42,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,44,42,35,38,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,37,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,38,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,44,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,37,37,38,37,42,44,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,64,64,64,64,64,64,64,64,64,64,64,64,64,64,35,40,37,37,42,42,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,64,64,64,64,64,64,64,64,64,64,64,64,64,37,47,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,38,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,35,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {40,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {35,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
        {47,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,32}
       };
       boolean direction=false;
       for(int i=0;i<data.length;i++){
           try {
             direction=!direction; 
             if (direction){
                for(int x=0;x<data[i].length;x++){               
                   Thread.sleep(5);
                   System.out.print(data[i][x]);
                }
             }else{
                for(int x=data[i].length-1;x>=0;x--){ 
                   for(int y=0;y<x;y++){
                       System.out.print(" ");
                   } 
                   Thread.sleep(5);
                   System.out.print(data[i][x]+"\r");
                }
             }
             
               System.out.println();
           
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
    }
    public static void main(String[] args) {
        new Thread(new ViratKohli()).start();       
    }
}