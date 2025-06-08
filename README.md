# game-theory  
Идея пришла после просмотра одного из видео Veritasium в ютубе. Сделал сообственнуя симуляцию игры "Дилемма Заключенного" или же "Теория Игр".
## How to use:  
Download zip file or just clone this project and run Main.java  
## Strategy in this project  
Cooperator: Always cooperates.  
Defector: Always defects.    
TitForTat: Starts with cooperation, then mirrors the opponent's last move.  
Grudger: Cooperates initially, but defects permanently if the opponent ever defects.  
Prober: Attempts to exploit the opponent by defecting, then adjusts.  
RandomStrategy: Makes random moves.  
Pavlov: Repeats its last move if it resulted in a "success" (both cooperated or both defected); otherwise, changes its move.  
SoftMajority: Cooperates as long as opponent cooperations outnumber or equal defections.  
HardMajority: Cooperates only if opponent cooperations strictly outnumber defections.  
TitForTwoTats: Cooperates, but defects only if the opponent defects twice consecutively.  
#Result you can watch on this site:[Game Theory results](https://eldar-05.github.io/game-theory-site/)
