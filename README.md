# War-Cards-Test
"Playing with(out) cards"

War cards Test was created as a fun coding experiment, as a command line application, to test the average turns it takes to win a game of war

Has (curently) 3 options for when you run, Game Count, Mn Cards, and Logging Options

The Game Count is how many games it will run through, 100 is low, 1000 is also low, 10k is good for testing/developing, 1 million is a good sample size, but 10 mill is pretty good, and takes ~2 hours on my i7 4th gen.

Min Cards is the threshhold for how many cards you have to have to loose, below 0 is impossable to end, 0 is normal, 5 means if you have 5,4,3,2, or 1 cards in your deck you loose.

And the Logging Options are: true- print the turns for each game, capping at 10k returning -1
  false- returns a (activle changing) precentage of/compleated turns, ETA, and time per game, for me 0.7 or so ms
