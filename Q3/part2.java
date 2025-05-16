public ArrayList<Match> buildMatches()
 {
    ArrayList<Match> result = new ArrayList<Match>();

    for (int i = 0; i < competitorList.size() / 2; i++)
    {
        if (competitorList.size() % 2 == 0)
        {
            result.add(new Match(competitorList.get(i), competitorList.get(competitorList.size() - 1 - i)));
        }

        else
        {
            result.add(new Match(competitorList.get(i + 1), competitorList.get(competitorList.size() - 1 - i)));
        }
    }

    return result;
 }
