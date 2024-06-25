interface Flying
{
    void fly();
}

interface Swimming
{
void swim();
}

class Bird implements Flying,Swimming
{
    @Override
    public void fly()
    {
        System.out.println("The bird is Flying.");
    }

    @Override
    public void swim()
    {
        System.out.println("The bird is swimming.");
    }
}

public class MutiIndex 
{
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.fly();
        bird.swim();
    }
}
