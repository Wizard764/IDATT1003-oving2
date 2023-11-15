package Main;

public class Main
{
    public static void main(String[] args)
    {
        Product[] products =    {new Product("A", 35.9f, .45f),
                                new Product("B", 39.5f, .5f),
                                new Product("C", 40.9f, .6f)};
        for(Product p : products)
        {
            System.out.println("Product " + p.GetName() + " has a price per kg of: " + Float.toString(p.GetPricePerWeight()));
        }
        boolean flag = true;
        while(flag)
        {
            for (byte i = 0; i < products.length - 1; i++) //Run through pairs of objects in products
            {
                if (products[i].GetPricePerWeight() > products[i+1].GetPricePerWeight()) //If two are in the wrong order, swap them
                {
                    Product p = products[i];
                    products[i] = products[i + 1];
                    products[i + 1] = p;
                    break; //Run through the array from the top
                }
                if (i == products.length - 2) //Execute when list is in the right order, when two products always true
                {
                    flag = false;
                }
            }
        }
        System.out.println();
        System.out.println("Ordered from cheapest to most expensive the products rank as follows:");
        for(Product p : products)
        {
            System.out.println("Product " + p.GetName() + " with a price of " + Float.toString(p.GetPricePerWeight()) + " per kg.");
        }
    }
}