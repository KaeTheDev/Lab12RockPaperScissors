public class TheJets extends Player
{
    String name = "The Jets";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String generateRoshambo()
    {
         return Roshambo.ROCK.toString();
    }
}
