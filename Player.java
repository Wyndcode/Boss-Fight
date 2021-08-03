
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JFrame {
    private int width;
    private int height;
    double bosshp = 1000000;
    double playerhp = 3000;
    double attbuff = 1;
    double defbuff = 1;
    double critbuff = 1;
    double attbreak = 1;
    double acc = 0;
    int darkness = 1;
    int light = 1;
    int stun = 0;
    int poison = 0;
    int burn = 0;
    int combo = 0;
    int protect = 3;
    int combo1power = 0;
    int combo2power = 0;
    int combo3power = 0;

    private Container contentPane;
    private Container helpPane;
    private JTextArea helpman;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton help;
    private JButton PunchStandard;
    private JButton PunchChemical;
    private JButton PunchChokehold;
    private JButton KickPower;
    private JButton KickJump;
    private JButton KickLow;
    private JButton GiantHammer;
    private JButton HookSwords;
    private JButton Kusarigama;
    private JButton Gun;
    private JButton DarkBlast;
    private JButton DarkHex;
    private JButton DarkA;
    private JButton DarkOverdrive;
    private JButton LightFlash;
    private JButton HeavenBlessing;
    private JButton GodsShield;
    private JButton DivineRetribution;
    private JButton combo1;
    private JButton combo2;
    private JButton combo3;
    private JTextArea message;
    private JTextArea status;
    private JTextArea bosstatus;
    private JTextArea bossmessage;

    public Player(int w, int h) {
        width = w;
        height = h;
        contentPane = this.getContentPane();
        message = new JTextArea();
        status = new JTextArea();
        bosstatus = new JTextArea();
        bossmessage = new JTextArea();
        b1 = new JButton("Punch");
        b2 = new JButton("Kick");
        b3 = new JButton("Weapon");
        b4 = new JButton("Dark Magic");
        b5 = new JButton("Light Magic");
        b6 = new JButton("Next");
        help = new JButton("Help Menu");
        combo1 = new JButton("The Old One's Rampage");
        combo2 = new JButton("Shattered Sky");
        combo3 = new JButton("The Real Boss");
        PunchStandard = new JButton("Standard Punch");
        PunchChemical = new JButton("Chemical Counter");
        PunchChokehold = new JButton("Chokehold");
        KickPower = new JButton("Jump Kick");
        KickJump = new JButton("Power Kick");
        KickLow = new JButton("Low Sweep");
        GiantHammer = new JButton("Giant Hammer");
        HookSwords = new JButton("Hook Swords");
        Kusarigama = new JButton("Kusarigama");
        Gun = new JButton("Gun");
        DarkBlast = new JButton("Dark Blast");
        DarkHex = new JButton("Dark Hexagram");
        DarkA = new JButton("Dark Assault");
        DarkOverdrive = new JButton("Darkness Overdrive");
        LightFlash = new JButton("Light Flash");
        HeavenBlessing = new JButton("Heaven's Blessing");
        GodsShield = new JButton("God's Shield");
        DivineRetribution = new JButton("Divine Retribution");
    }

    public void setupGUI() {
        this.setSize(width, height);
        this.setTitle("Boss Fight");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setLayout(new GridLayout(8, 5));
        contentPane.add(message);
        message.setText("An otherworldly being has appeared! This is a turn-based game for killing the boss. Buffs and debuffs wear off over turns and each move in the game has its own special purpose. Show that robot no mercy!");
        message.setWrapStyleWord(true);
        message.setLineWrap(true);
        message.setEditable(false);
        contentPane.add(status);
        status.setText("   Player Status:\n Hp-" + playerhp + "   Atk-" + attbuff + "\n Def-" + defbuff + "   CritRate-" + critbuff + "\n Combogauge -" + combo + "/200  " + "Acc=" + acc + "\n Dark Energy -" + darkness + "  Light Energy -" + light);
        status.setWrapStyleWord(true);
        status.setLineWrap(true);
        status.setEditable(false);
        contentPane.add(bosstatus);
        bosstatus.setText("Boss Status:\n Hp- " + bosshp + "   Atk-" + attbreak + "\n Poison-" + poison + "   Burn-" + burn + "\n Stun -" + stun);
        bosstatus.setWrapStyleWord(true);
        bosstatus.setLineWrap(true);
        bosstatus.setEditable(false);
        contentPane.add(bossmessage);
        bossmessage.setText("");
        bossmessage.setWrapStyleWord(true);
        bossmessage.setLineWrap(true);
        bossmessage.setEditable(false);
        contentPane.add(help);
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);
        contentPane.add(combo1);
        contentPane.add(combo2);
        contentPane.add(combo3);
        contentPane.add(PunchStandard);
        contentPane.add(PunchChemical);
        contentPane.add(PunchChokehold);
        contentPane.add(KickPower);
        contentPane.add(KickJump);
        contentPane.add(KickLow);
        contentPane.add(GiantHammer);
        contentPane.add(HookSwords);
        contentPane.add(Kusarigama);
        contentPane.add(Gun);
        contentPane.add(DarkBlast);
        contentPane.add(DarkHex);
        contentPane.add(DarkA);
        contentPane.add(DarkOverdrive);
        contentPane.add(LightFlash);
        contentPane.add(HeavenBlessing);
        contentPane.add(GodsShield);
        contentPane.add(DivineRetribution);
        help.addActionListener(new help1());
        b1.addActionListener(new Action1());
        b2.addActionListener(new Action2());
        b3.addActionListener(new Action3());
        b4.addActionListener(new Action4());
        b5.addActionListener(new Action5());
        b6.addActionListener(new Action6());
        combo1.addActionListener(new combo1a());
        combo2.addActionListener(new combo2a());
        combo3.addActionListener(new combo3a());
        PunchStandard.addActionListener(new PunchStandardAction());
        PunchChemical.addActionListener(new PunchChemicalAction());
        PunchChokehold.addActionListener(new PunchChokeholdAction());
        KickPower.addActionListener(new KickPowerAction());
        KickJump.addActionListener(new KickJumpAction());
        KickLow.addActionListener(new KickLowAction());
        GiantHammer.addActionListener(new HammerAction());
        HookSwords.addActionListener(new SwordsAction());
        Kusarigama.addActionListener(new KusarigamaAction());
        Gun.addActionListener(new GunAction());
        DarkBlast.addActionListener(new BlastAction());
        DarkHex.addActionListener(new HexAction());
        DarkA.addActionListener(new AssaultAction());
        DarkOverdrive.addActionListener(new OverdriveAction());
        LightFlash.addActionListener(new FlashAction());
        HeavenBlessing.addActionListener(new BlessAction());
        GodsShield.addActionListener(new ShieldAction());
        DivineRetribution.addActionListener(new DivineAction());
        this.setVisible(true);
        b6.setVisible(false);
        combo1.setVisible(false);
        combo2.setVisible(false);
        combo3.setVisible(false);
        PunchStandard.setVisible(false);
        PunchChemical.setVisible(false);
        PunchChokehold.setVisible(false);
        KickPower.setVisible(false);
        KickJump.setVisible(false);
        KickLow.setVisible(false);
        GiantHammer.setVisible(false);
        HookSwords.setVisible(false);
        Kusarigama.setVisible(false);
        Gun.setVisible(false);
        DarkBlast.setVisible(false);
        DarkHex.setVisible(false);
        DarkA.setVisible(false);
        DarkOverdrive.setVisible(false);
        LightFlash.setVisible(false);
        HeavenBlessing.setVisible(false);
        GodsShield.setVisible(false);
        DivineRetribution.setVisible(false);
        boolean loop = false;
        while (!loop) {
            if (attbuff > 6){
                attbuff = 6;
            }
            if (defbuff>6){
                defbuff = 6;
            }
            if(critbuff > 4){
                critbuff = 4;
            }
            if(acc > 3){
                acc = 3;
            }
            if(darkness > 12){
                darkness = 12;
            }
            if(light > 12){
                light = 12;
            }
            if(burn > 10){
                burn = 10;
            }
            if(poison > 10){
                poison = 10;
            }
            status.setText("   Player Status:\n Hp=" + playerhp + "   Atk=" + attbuff + "\n Def-" + defbuff + "   CritRate=" + critbuff + "\n Combogauge =" + combo + "/200  " + "Acc=" + acc + "\n Dark Energy =" + darkness + "  Light Energy =" + light);
            bosstatus.setText("Boss Status:\n Hp= " + bosshp + "   Atk=" + attbreak + "\n Poison=" + poison + "   Burn=" + burn + "\n Stun =" + stun);
        }
    }

    public static void main(String[] args) {
        Player p = new Player(2000, 1000);
        p.setupGUI();
    }
    class help1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame bepis = new JFrame("Help");
            helpPane = new Container();
            helpman = new JTextArea();
            bepis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            bepis.setVisible(true);
            bepis.add(helpPane);
            bepis.setSize(1000, 1000);
            helpPane.setLayout(new GridLayout(1, 1));
            helpPane.add(helpman);
            helpman.setWrapStyleWord(true);
            helpman.setLineWrap(true);
            helpman.setEditable(false);
            helpman.setText("This is the help menu \n" + "It highlights all the moves for each button \nAcc=accuracy, Attbuff= attack buff, Defbuff= defense buff, Critbuff= critical rate, Attbreak= boss attack decrease \nStun= immobilizes boss for turns, Poison= boss current hp % based damage, Burn= constant damage that lowers over time\n" +
                    "Punches \nStandard Punch: 1/13 miss rate | 10/13 hit rate (combo 35, damage 1750) | 2/13 crit rate (combo 65, damage 3500) \n" +
                    "Chokehold: 6/13 miss rate | 4/13 hit rate(combo 25, stun 1, damage 1000) | 3/13 crit rate(combo 50, stun 2, burn 1, damage 3000)\n" +
                    "Chemical Counter: Damage based on Player hp | 2000+(combo 10, damage 500) | 2000-1250(combo 20, burn 2, poison 2, damage 1000) | 1250-500(combo 50, burn 5, poison 5, damage 2500)| 500-0(combo 100, burn 8, stun 2, defbuff 4, attbuff 4, attbreak 0.25, critbuff 3, acc 4, damage 10000)\n\n" +
                    "Kicks\nJump Kick: 1/13 miss rate | 9/13 hit rate (combo 25, damage 1750) | 3/13 crit rate(combo 45, damage 5000)\n" +
                    "Power Kick: 1/13 miss rate | 9/13 hit rate (combo 25, damage 3000) | 3/13 crit rate (combo 45, damage 3500)\n" +
                    "Low Sweep: 6/13 miss rate | 6/13 hit rate (combo 50, damage 2500) | 1/13 crit rate (combo 100, damage 4000)\n\n" +
                    "Weapons\nGiant Hammer: 5/13 miss rate (recoil 300) | 4/13 hit rate (damage 4000, recoil 200) | 4/13 crit rate (damage 9000, recoil 100) | Special Weapon Technique (damage 15000, recoil 400)\n" +
                    "Hook Swords: 1/13 miss rate | 2/13 hit rate (combo 10, damage 500) | 2/13 double hit rate (combo 20, damage 1000) | 2/13 double combo rate (combo 30, damage 1500) | 2/13 double head rate (combo 40, damage 2000) | 2/13 spin rate (combo 50, damage 3000) | 2/13 crit rate (combo 60, acc 2; damage 5000) | Special Weapon Technique (combo 70, acc 3, criftbuff 3, damage 8000)\n" +
                    "Kusarigama: 5/13 miss rate (recoil 200) | 4/13 hit rate (combo 25, attbreak 0.25; damage 500) | 4/13 crit rate (combo 35, attbreak 0.25, damage 3000) | Special Weapon Technique (combo 50, attbreak 0.5, stun 1, damage 5000)\n" +
                    "Gun: 2/13 miss rate | 2/13 hit rate (damage 5000 flat) | 2/13 double hit rate (damage 10000 flat) | 7/13 random roll 1/5 chance for each: Olympia(burn 2, damage 21000 flat), Cheytac.408(acc 3, damage 15000 flat), M16a4(combo 100, damage 18000 flat), Rifle(damage 15000), Chainsaw Grenade Launcher(insane damage as boss health lowers) | Special Weapon Technique (unknown?)\n\n" +
                    "Dark Magic (damage amplified by Darkness and heals the Boss if Light is stronger)\nDark Blast: Damage as boss health lowers, Life Drain, Dark 1, Light -1\n" +
                    "Dark Hexagram: 3/13 miss rate (Dark 1, Light -1) | 3/13 apply rate (critbuff 2, Dark 1, Light -1) | 4/13 better rate (critbuff 2, attbuff 2, Dark 2, Light -2) | 3/13 best rate (critbuff 3, acc 3, attbuff 3, Dark 3, Light -3)\n" +
                    "Dark Assault: 5/13 hit rate (damage 1000, Dark 1, Light -1) | 4/13 stronger hit rate (damage 2000, Dark 2, Light -2) | 4/13 crit rate (Life drain, poison 2, damage 3000, Dark 3, Light -3) | Special Magic Technique (Life drain, poison 3, damage 5000, Dark 4, Light 4)\n" +
                    "Darkness Overdrive: Darkness needs to be over 8 to work: acc 3, critbuff 3, attbuff 3, poison 5, damage 5000, Darkness is set to 1, Light is set to 1\n\n" +
                    "Light Magic (damage amplified by Light and heals the Boss if Darkness is stronger)\nLight Flash: Burn 2, Damage the more health the boss has, Light 1, Dark -1\n" +
                    "Heaven's Blessing: 3/13 miss rate (Dark -1, Light + 1) | 3/13 apply rate (critbuff 2 Dark -1, Light +1) | 4/13 better rate (defbuff 2, critbuff 2, attbreak -0.25, Dark -2, Light +2) | 1/13 best rate (defbuff 4, attbreak -0.5, burn 4, critbuff 3, Dark -3, Light +3)\n" +
                    "God's Shield: First use 100%, each use after success is halved (Stun 1, Heal 300)\n" +
                    "Divine Retribution: Light needs to be over 8 to work: def 4, attbreak 0.5, burn 3, damage 4000, Darkness is set to 1, Light is set to 1\n\n" +
                    "The Old One's Rampage-use when you prefer punches and kicks\n" +
                    "Shattered Sky-use when you prefer using melee weapons\n" +
                    "The Real Boss-use when you prefer spamming guns");
        }
    }
    class Action6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(combo >= 200 && bosshp >= 0){
                combo1.setVisible(true);
                combo2.setVisible(true);
                combo3.setVisible(true);
            }
            if (burn > 0) {
                bosshp = bosshp - (burn * 1000);
                attbreak = attbreak - 0.25;
                burn = burn - 1;
            }
            if (poison > 0) {
                bosshp = bosshp - ((0.05 * bosshp) * (poison)) / 2;
                poison = poison - 1;
            }
            if(bosshp <= 0){
                bosshp = 0;
                bossmessage.setText("The boss dies, you win!");
                message.setText("Exit Application");
                b1.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b5.setVisible(false);
                b6.setVisible(false);
                help.setVisible(false);
            }
            if (playerhp > 0 && (stun <= 0 && bosshp > 0)) {
                for (int l = 0; l < 1; l++) {
                    int dongattack = (int) (100.0 * Math.random());
                    if(dongattack>=90){
                        bossmessage.setText("The boss absorbs elements of Earth. His attack greatly increases");
                        attbreak = Math.abs(attbreak)*2;
                    }
                    if(dongattack < 90 && dongattack >= 70){
                        bossmessage.setText("The boss uses a powerful galactic mirror and attacks you using your own attack power. This attack ignores your defense");
                        playerhp = playerhp - ((400*attbreak))*(attbuff/2);
                    }
                    if (dongattack < 70 && dongattack >= 60) {
                        bossmessage.setText("The boss aims at you and fires. It removes all your beneficial effects.");
                        playerhp = playerhp - ((400 * attbreak) / defbuff);
                        defbuff = 1;
                        attbuff = 1;
                        critbuff = 0;
                        acc = 0;
                    }
                    if (dongattack < 60 && dongattack >= 50) {
                        bossmessage.setText("The boss stomps on the floor, causing an earthquake, which doesn't do much but deals damage according to your defense. It lowers your accuracy and crit rate");
                        playerhp = playerhp - (((35 * attbreak) / defbuff)*defbuff);
                        if (acc > 0) {
                            acc = acc - 1;
                        }
                        if(critbuff > 1){
                            critbuff = critbuff - 1;
                        }
                    }
                    if (dongattack < 50 && dongattack >= 40) {
                        bossmessage.setText("The boss fires out a lazer beam. It heals him for a fourth of his health");
                        bosshp = bosshp + 250000;
                        if(bosshp > 1000000){
                            bosshp = 1000000;
                        }
                        playerhp = playerhp - ((225 * attbreak) / defbuff);
                    }
                    if (dongattack < 40 && dongattack >= 30) {
                        bossmessage.setText("The boss projects supersonic waves. They make him immune to stun for the next few turns");
                        playerhp = playerhp - ((70 * attbreak) / defbuff);
                        stun = stun - 2;
                    }
                    if (dongattack <= 30 && dongattack > 20) {
                        bossmessage.setText("The boss crackles a whip at you, which resets one of your buffs randomly");
                        for (int o = 0; o < 1; o++) {
                            int whipcrack = (int) (4.0 * Math.random());
                            playerhp = playerhp - ((500 * attbreak) / defbuff);
                            if (whipcrack == 1){
                            attbuff = 1;
                            }
                            if(whipcrack == 3) {
                                defbuff = 1;
                            }
                            if(whipcrack == 2) {
                                critbuff = 1;
                            }
                            if(whipcrack == 0) {
                                acc = 0;
                            }
                        }
                    }
                    if (dongattack <= 20 && dongattack > 15) {
                        bossmessage.setText("The boss fires an ice shard at you. It greatly lowers your attack");
                        playerhp = playerhp - ((275 * attbreak) / defbuff);
                        attbuff = attbuff - attbuff/3;
                    }
                    if (dongattack <= 15) {
                        if (burn > 0) {
                            burn = burn - 1;
                        }
                        if(poison > 0) {
                            poison = poison - 1;
                        }
                        for (int u = 0; u < 1; u++) {
                            int minion = (int) (3.0 * Math.random());
                            if (minion == 0) {
                                bossmessage.setText("One minion is summoned. It absorbs some of the boss's status effects. It scratches its fingernails against a chalkboard.");
                                playerhp = playerhp - ((75 * attbreak) / defbuff);
                            }
                            if (minion == 1) {
                                bossmessage.setText("Two minions are summoned. They absorb some of the boss's status effects. They stack on top of each other and the one on top jumps on you");
                                playerhp = playerhp - ((200 * attbreak) / defbuff);
                            }
                            if (minion == 2) {
                                bossmessage.setText("Eight minions are summoned. They cancel the boss's status effects. They surround you and brutally tear off your skin, flesh, and limbs");
                                poison = 0;
                                burn = 0;
                                playerhp = playerhp - ((375 * attbreak) / defbuff);
                            }
                        }

                    }
                }
                if (attbuff > 1) {
                    attbuff = attbuff - 1;
                }
                if (attbreak < 1) {
                    attbreak = attbreak + 0.25;
                }
                if (critbuff > 1) {
                    critbuff = critbuff - 0.5;
                }
                if (defbuff > 1) {
                    defbuff = defbuff - 1;
                }
                if (acc > 0) {
                    acc = acc - 1;
                }
                if (burn > 0) {
                    attbreak = attbreak + 0.25;
                }
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(false);
            }
            else if (playerhp <= 0){
                playerhp = 0;
                message.setText("You die, exit application");
                b1.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b5.setVisible(false);
                b6.setVisible(false);
            }
            if (stun > 0 && bosshp > 0) {
                stun = stun - 1;
                bossmessage.setText("The boss is stunned");
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b6.setVisible(false);
            }
            if(stun<0){
                stun = stun + 1;
            }
            if(bosshp>0){message.setText("Choose a move");}
            }
        }
    class combo1a implements ActionListener{
        public void actionPerformed(ActionEvent e){
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            message.setText("You fly into the air and land on the boss with an axe kick. You follow up with a back kick and leap forward again. You dig your nails deep into the boss's throat and inject all sorts of toxins. You then tear your fingers out and ram a foot forward, guillotining him.");
            bosshp = bosshp - (20000*attbuff + 5000*combo1power);
            attbuff = attbuff + 5;
            poison = poison + 5;
            combo1.setVisible(false);
            combo2.setVisible(false);
            combo3.setVisible(false);
            b6.setVisible(true);
            combo = combo - 200;
            combo1power = 0;
        }
    }
    class combo2a implements ActionListener{
        public void actionPerformed(ActionEvent e){
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            message.setText("Your entire body flashes with electricity. You grapple your Kusarigama's sickle into the boss's throat, sending in waves of pure, blue energy. You toss six Hook Swords behind the boss, then you swing your Electromagnetic Massive Hammer and crush his ribcage. The magnetism draws the Hook Swords towards the Hammer, and within seconds the Boss is skewered.");
            burn = burn + 8;
            stun = stun + 1;
            critbuff = critbuff + 3;
            bosshp = bosshp - (10000*attbuff + 10000*combo2power);
            combo1.setVisible(false);
            combo2.setVisible(false);
            combo3.setVisible(false);
            b6.setVisible(true);
            combo = combo - 200;
            combo2power = 0;
        }
    }
    class combo3a implements ActionListener{
        public void actionPerformed(ActionEvent e){
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            message.setText("Your eyes glow a dark piercing red as the moon eclipses over the sun. You do not notice the shadows growing taller, nor do you notice the wind blowing colder, with trickles of snow and rain in the mix. Because at this moment, you are the most vicious, apex predator that has ever lived. And the boss is your prey.");
            bosshp = bosshp - (40000*combo3power);
            combo1.setVisible(false);
            combo2.setVisible(false);
            combo3.setVisible(false);
            b6.setVisible(true);
            combo = combo - 200;
            combo3power = 0;
        }
    }
    class Action1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            PunchStandard.setVisible(true);
            PunchChemical.setVisible(true);
            PunchChokehold.setVisible(true);
            message.setText("Choose a punch");
        }
    }

    class PunchChokeholdAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int chokechance = (int) (13.0 * Math.random());
                double chokecrit = chokechance * critbuff + acc;
                if (chokecrit <= 5) {
                    message.setText("You miss your chokehold");
                }
                if (chokecrit > 5 && chokecrit <= 9) {
                    message.setText("You grab the boss by the waist and throw him onto the ground");
                    bosshp = bosshp - 1000 * attbuff;
                    stun = stun + 1;
                    combo = combo + 25;
                    combo1power = combo1power + 1;
                }
                if (chokecrit > 9) {
                    message.setText("You grab the boss by the throat and pummel him into the ground headfirst");
                    bosshp = bosshp - 3000 * attbuff;
                    stun = stun + 2;
                    burn = burn + 1;
                    combo = combo + 50;
                    combo1power = combo1power + 1;
                }
                b6.setVisible(true);
                PunchStandard.setVisible(false);
                PunchChemical.setVisible(false);
                PunchChokehold.setVisible(false);
            }
        }
    }

    class PunchChemicalAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (playerhp >= 2000) {
                message.setText("You test out the prototype chemical counter you were given. \n You utilize it correctly, but it doesn't seem to work how it's supposed to");
                bosshp = bosshp - 500 * attbuff;
                combo = combo + 10;
                combo1power = combo1power + 1;
            }
            if (playerhp < 2000 && playerhp >= 1250) {
                message.setText("You take out the prototype chemical counter in panic. \n As if sensing your urgency, the weapon coats itself in a black haze, and you perform a punch with it");
                bosshp = bosshp - 1000 * attbuff;
                poison = poison + 2;
                burn = burn + 2;
                combo = combo + 20;
                combo1power = combo1power + 1;
            }
            if (playerhp < 1250 && playerhp >= 500) {
                message.setText("As if it were alive, the prototype chemical counter slides onto your hand. \n Your entire body feels pumped up with adrenaline when it contacts. \n You draw your hand back, and thrust forward, as gallons of sewage and arsenic flood into view");
                bosshp = bosshp - 2500 * attbuff;
                poison = poison + 5;
                burn = burn + 5;
                combo = combo + 50;
                combo1power = combo1power + 1;
            }
            if (playerhp < 500) {
                message.setText("Your entire body feels like its burning. \n Suddenly, the prototype chemical counter glows a dark green. \n It shatters into multiple pieces shaped perfectly as your limbs, and attaches to you. You charge forward at the boss in a violet storm of blood, shadows, and screams of the damned. \n Just what is this weapon exactly?");
                bosshp = bosshp - 10000 * attbuff;
                poison = poison + 8;
                burn = burn + 8;
                stun = stun + 2;
                defbuff = defbuff + 4;
                attbuff = attbuff + 4;
                attbreak = attbreak - 0.25;
                critbuff = critbuff + 3;
                acc = acc + 4;
                combo = combo + 100;
                combo1power = combo1power + 1;
            }
            b6.setVisible(true);
            PunchStandard.setVisible(false);
            PunchChemical.setVisible(false);
            PunchChokehold.setVisible(false);
        }
    }

    class PunchStandardAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int standardchance = (int) (13.0 * Math.random());
                double standardcrit = standardchance * critbuff + acc;
                if (standardcrit == 0) {
                    message.setText("You miss your Standard Punch");
                }
                if (standardcrit > 0 && standardcrit <= 9) {
                    message.setText("You perform a Standard Punch");
                    bosshp = bosshp - 1750 * attbuff;
                    combo = combo + 35;
                    combo1power = combo1power + 1;
                }
                if (standardcrit > 9) {
                    message.setText("You perform a Standard Punch. It is a critical hit!");
                    bosshp = bosshp - 3500 * attbuff;
                    combo = combo + 65;
                    combo1power = combo1power + 1;
                }
                b6.setVisible(true);
                PunchStandard.setVisible(false);
                PunchChemical.setVisible(false);
                PunchChokehold.setVisible(false);
            }
        }
    }

    class Action2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            KickPower.setVisible(true);
            KickJump.setVisible(true);
            KickLow.setVisible(true);
            message.setText("Choose a kick");
        }
    }

    class KickJumpAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int powerchance = (int) (13.0 * Math.random());
                double powercrit = powerchance * critbuff + acc;
                if (powercrit == 0) {
                    message.setText("You miss your power kick");
                }
                if (powercrit > 0 && powercrit <= 9) {
                    message.setText("You perform a power kick");
                    bosshp = bosshp - 3000 * attbuff;
                    combo = combo + 25;
                    combo1power = combo1power + 1;
                }
                if (powercrit > 9) {
                    message.setText("You perform a power kick. It is a critical hit!");
                    bosshp = bosshp - 3500 * attbuff;
                    combo = combo + 45;
                    combo1power = combo1power + 1;
                }
                b6.setVisible(true);
                KickJump.setVisible(false);
                KickLow.setVisible(false);
                KickPower.setVisible(false);
            }
        }
    }

    class KickPowerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int jumpchance = (int) (13.0 * Math.random());
                double jumpcrit = jumpchance * critbuff + acc;
                if (jumpcrit == 0) {
                    message.setText("You miss your jump kick");
                }
                if (jumpcrit > 0 && jumpcrit <= 9) {
                    message.setText("You perform a jump kick, which misses the head but lands close to there");
                    bosshp = bosshp - 1750 * attbuff;
                    combo = combo + 25;
                    combo1power = combo1power + 1;
                }
                if (jumpcrit > 9) {
                    message.setText("You perform a jump kick. It is a head hit!");
                    bosshp = bosshp - 5000 * attbuff;
                    combo = combo + 45;
                    combo1power = combo1power + 1;
                }
                b6.setVisible(true);
                KickJump.setVisible(false);
                KickLow.setVisible(false);
                KickPower.setVisible(false);
            }
        }
    }

    class KickLowAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int lowchance = (int) (13.0 * Math.random());
                double lowcrit = lowchance * critbuff + acc;
                if (lowcrit <= 5) {
                    message.setText("You miss your low sweep, which is a very hard kick to land");
                }
                if (lowcrit > 5 && lowcrit <= 11) {
                    message.setText("You perform a low sweep");
                    bosshp = bosshp - 2500 * attbuff;
                    combo = combo + 50;
                    combo1power = combo1power + 1;
                }
                if (lowcrit > 11) {
                    message.setText("You perform a low sweep. It is a critical hit!");
                    bosshp = bosshp - 4000 * attbuff;
                    combo = combo + 100;
                    combo1power = combo1power + 1;
                }
                b6.setVisible(true);
                KickJump.setVisible(false);
                KickLow.setVisible(false);
                KickPower.setVisible(false);
            }
        }
    }

    class Action3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            GiantHammer.setVisible(true);
            HookSwords.setVisible(true);
            Kusarigama.setVisible(true);
            Gun.setVisible(true);
            message.setText("Choose a weapon");
        }
    }

    class HammerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int hammerchance = (int) (13.0 * Math.random());
                double hammercrit = hammerchance * critbuff + acc;
                if (hammercrit <= 4) {
                    message.setText("You try lifting up your Giant Hammer, but struggle and collapse");
                    playerhp = playerhp - 300;
                }
                if (hammercrit > 4 && hammercrit <= 8) {
                    message.setText("You lift up the Giant Hammer, and stumble forward, striking a brushing blow on the boss");
                    bosshp = bosshp - 4000 * attbuff;
                    playerhp = playerhp - 200;
                    combo2power = combo2power + 1;
                }
                if (hammercrit > 8 && hammercrit <= 12) {
                    message.setText("You confidently wield the Giant Hammer, and crush the boss under its weight");
                    bosshp = bosshp - 9000 * attbuff;
                    playerhp = playerhp - 100;
                    combo2power = combo2power + 1;
                }
                if (hammercrit > 12) {
                    message.setText("A surge of power tears through your back and arms, and the Hammer grows to its original size when a certain god wielded it. \n As you bring down the Massive Hammer, a flushing current of lightning rushes down with it. \n The ground is split into small cinders of rock, and the boss is barely recognizable anymore");
                    bosshp = bosshp - 15000 * attbuff;
                    playerhp = playerhp - 400;
                    combo2power = combo2power + 1;
                }
                b6.setVisible(true);
                GiantHammer.setVisible(false);
                HookSwords.setVisible(false);
                Kusarigama.setVisible(false);
                Gun.setVisible(false);
            }
        }
    }

    class SwordsAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Swordschance = (int) (13.0 * Math.random());
                double Swordscrit = Swordschance * critbuff + acc;
                if (Swordscrit == 0) {
                    message.setText("You swing and miss with the Hook Swords");
                }
                if (Swordscrit > 0 && Swordscrit <= 2) {
                    message.setText("You swing and hit with one Hook Sword, but miss with the other");
                    bosshp = bosshp - 500 * attbuff;
                    combo = combo + 10;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 2 && Swordscrit <= 4) {
                    message.setText("You swing and hit with both Hook Swords");
                    bosshp = bosshp - 1000 * attbuff;
                    combo = combo + 20;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 4 && Swordscrit <= 6) {
                    message.setText("You swing and grapple the boss's limb towards you with one sword, and strike him with the other");
                    bosshp = bosshp - 1500 * attbuff;
                    combo = combo + 30;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 6 && Swordscrit <= 8) {
                    message.setText("You hook your Hook Swords together and, holding one end, swing them at the boss, catching his head twice with the other handle");
                    bosshp = bosshp - 2000 * attbuff;
                    combo = combo + 40;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 8 && Swordscrit <= 10) {
                    message.setText("You attach your Hook Swords together by the handles and charge at the boss, spinning the now one-handed weapon faster than his eye can follow");
                    bosshp = bosshp - 3000 * attbuff;
                    combo = combo + 50;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 10 && Swordscrit <= 12) {
                    message.setText("You hook your Hook Swords together and fling the newly assembled boomerang at the boss. \n It strikes his body countless times, clamps his neck and chokes him, and comes back to you.");
                    bosshp = bosshp - 5000 * attbuff;
                    combo = combo + 60;
                    acc = acc + 2;
                    combo2power = combo2power + 1;
                }
                if (Swordscrit > 12) {
                    message.setText("You split your two Hook Swords into six, with one in your mouth, two in your hands, two in your feet, and one on your back. \n You flip through the sky and land on the boss, and finish with not a single uncut piece of skin on his body");
                    bosshp = bosshp - 8000 * attbuff;
                    combo = combo + 70;
                    acc = acc + 3;
                    critbuff = critbuff + 3;
                    combo2power = combo2power + 1;
                }
                b6.setVisible(true);
                GiantHammer.setVisible(false);
                HookSwords.setVisible(false);
                Kusarigama.setVisible(false);
                Gun.setVisible(false);
            }
        }
    }

    class KusarigamaAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Kusarichance = (int) (13.0 * Math.random());
                double Kusaricrit = Kusarichance * critbuff + acc;
                if (Kusaricrit <= 4) {
                    message.setText("You try using the Kusarigama, but fail and tangle yourself up");
                    playerhp = playerhp - 200;
                }
                if (Kusaricrit > 4 && Kusaricrit <= 8) {
                    message.setText("You swing the metal ball of the Kusarigama at the boss's arm, and hold it down");
                    bosshp = bosshp - 500 * attbuff;
                    attbreak = attbreak - 0.25;
                    combo = combo + 25;
                    combo2power = combo2power + 1;
                }
                if (Kusaricrit > 8 && Kusaricrit <= 12) {
                    message.setText("You swing the scythe of the Kusarigama at the boss and impale his neck and shoulder. \n You then grapple the metal ball around his neck and cut off his oxygen");
                    bosshp = bosshp - 3000 * attbuff;
                    attbreak = attbreak - 0.25;
                    combo = combo + 35;
                    combo2power = combo2power + 1;
                }
                if (Kusaricrit > 12) {
                    message.setText("You swing the scythe of the Kusarigama at the boss's waist. \n You spin around and hold the Kusarigama by the ball and charge at the boss. \n You impale his neck, then his head with two consecutive swings. \n You finish him by burying the sickle into his head, and his head into the ground");
                    bosshp = bosshp - 5000 * attbuff;
                    attbreak = attbreak - 0.5;
                    stun = stun + 1;
                    combo = combo + 50;
                    combo2power = combo2power + 1;
                }
                b6.setVisible(true);
                GiantHammer.setVisible(false);
                HookSwords.setVisible(false);
                Kusarigama.setVisible(false);
                Gun.setVisible(false);
            }
        }
    }

    class GunAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Gunchance = (int) (13.0 * Math.random());
                double Guncrit = Gunchance * critbuff + acc;
                if (Guncrit <= 1) {
                    message.setText("You take out a Desert Eagle, but miss with it");
                }
                if (Guncrit > 1 && Guncrit <= 3) {
                    message.setText("You take out a Desert Eagle, and fire a heavy shot at the boss");
                    bosshp = bosshp - 5000;
                    combo3power = combo3power + 1;
                }
                if (Guncrit > 3 && Guncrit <= 5) {
                    message.setText("You dual wield two Desert Eagles, and fire a barrage at the boss");
                    bosshp = bosshp - 10000;
                    combo3power = combo3power + 1;
                }
                if (Guncrit > 5 && Guncrit < 16) {
                    for (int l = 0; l < 1; l++) {
                        int WildWestRoll = (int) (5 * Math.random());
                        if (WildWestRoll == 0) {
                            message.setText("You pull out an Olympia and jam it into the boss's stomach, and fire off a spray of bullets");
                            bosshp = bosshp - 21000;
                            burn = burn + 2;
                            combo3power = combo3power + 1;
                        }
                        if (WildWestRoll == 1) {
                            message.setText("You whip out a Cheytac.408 and snipe the boss in the head");
                            bosshp = bosshp - 15000;
                            acc = acc + 3;
                            combo3power = combo3power + 1;
                        }
                        if (WildWestRoll == 2) {
                            message.setText("You take out an M16a4 and spam the trigger button, putting holes all over the boss's body");
                            bosshp = bosshp - 18000;
                            combo = combo + 100;
                            combo3power = combo3power + 1;

                        }
                        if (WildWestRoll == 3) {
                            message.setText("You charge up to the boss and impale him with the bayonet of your hunting rifle");
                            bosshp = bosshp - 15000 * attbuff;
                            combo3power = combo3power + 1;
                        }
                        if (WildWestRoll == 4) {
                            message.setText("You pull out a Chainsaw Grenade Launcher and saw a hole through the boss, then you jam a couple of grenades in there and turn around");
                            double blastdamage = 4*(1000000000) / bosshp;
                            bosshp = bosshp - blastdamage;
                            combo3power = combo3power + 1;
                        }
                    }
                }
                if (Guncrit >= 16) {
                    message.setText("A Neo Armstrong Cyclone Jet Armstrong Cannon falls from the sky. Unknowing what it does, you press the fire button");
                    bosshp = bosshp - 200000;
                    combo3power = combo3power + 1;
                }
            }
            b6.setVisible(true);
            GiantHammer.setVisible(false);
            HookSwords.setVisible(false);
            Kusarigama.setVisible(false);
            Gun.setVisible(false);
        }
    }

    class Action4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            DarkBlast.setVisible(true);
            DarkHex.setVisible(true);
            DarkA.setVisible(true);
            DarkOverdrive.setVisible(true);
            message.setText("Choose a Dark Magic Spell");
        }
    }

    class BlastAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            message.setText("You peer deep into the Boss's mind and ignite his suffering. You gain health proportionately to the damage");
            double darkblastdamage = (900000000 / bosshp) * (darkness/2);
            playerhp = playerhp + (darkblastdamage/10);
            darkness = darkness + 1;
            light = light - 1;
            bosshp = bosshp - darkblastdamage;
            b6.setVisible(true);
            DarkA.setVisible(false);
            DarkBlast.setVisible(false);
            DarkHex.setVisible(false);
            DarkOverdrive.setVisible(false);
        }
    }

    class HexAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Hexchance = (int) (13.0 * Math.random());
                double Hexcrit = Hexchance * critbuff + acc;
                if (Hexcrit <= 2) {
                    message.setText("You accidentally draw a square instead of a Hexagram");
                }
                if (Hexcrit > 2 && Hexcrit <= 5) {
                    message.setText("You draw a Dark Hexagram. It buffs your critrate");
                    critbuff = critbuff + 2;
                }
                if (Hexcrit > 5 && Hexcrit <= 9) {
                    message.setText("You draw a Dark Hexagram, which glows in ultraviolet light. It buffs your critrate and attack");
                    critbuff = critbuff + 2;
                    attbuff = attbuff + 2;
                    darkness = darkness + 1;
                    light = light - 1;
                }
                if (Hexcrit > 9) {
                    message.setText("You draw a Dark Hexagram, which glows in pure, black light. It buffs your critrate, attack, and accuracy");
                    critbuff = critbuff + 3;
                    attbuff = attbuff + 3;
                    acc = acc + 3;
                    darkness = darkness + 2;
                    light = light - 2;
                }
                darkness = darkness + 1;
                light = light - 1;
                b6.setVisible(true);
                DarkA.setVisible(false);
                DarkBlast.setVisible(false);
                DarkHex.setVisible(false);
                DarkOverdrive.setVisible(false);
            }
        }
    }

    class AssaultAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Achance = (int) (13.0 * Math.random());
                double Acrit = Achance * critbuff + acc;
                if (Acrit <= 4) {
                    message.setText("You surround yourself in a pitch black darkness, then charge at the boss");
                    bosshp = bosshp - (1000 * attbuff) * darkness;
                }
                if (Acrit > 4 && Acrit <= 8) {
                    message.setText("You surround yourself in a pitch black darkness. A deep howling can be heard as you leap forward at the boss");
                    bosshp = bosshp - (2000 * attbuff) * darkness;
                    darkness = darkness + 1;
                    light = light - 1;
                }
                if (Acrit > 8 && Acrit <= 12) {
                    message.setText("You drench yourself in shadows strong enough to suck in all the light in a mile radius, and chip away at the boss's life energy, gaining health proportionate to the damage");
                    double darkAdamage = (3000 * attbuff) * darkness;
                    bosshp = bosshp - darkAdamage;
                    playerhp = playerhp + (darkAdamage/50);
                    poison = poison + 2;
                    darkness = darkness + 2;
                    light = light - 2;
                    if(playerhp>3000){
                        playerhp = 3000;
                    }
                }
                if (Acrit > 12) {
                    message.setText("You create a palm sized black hole, and casually flick it at the boss. The light drains from the world for a split second and blackouts occur in each city, energy flowing into you by the second.");
                    double darkAsdamage = (5000 * attbuff) * (darkness/2);
                    bosshp = bosshp - darkAsdamage;
                    playerhp = playerhp + (darkAsdamage/40);
                    if(playerhp>3000){
                        playerhp = 3000;
                    }
                    poison = poison + 3;
                    darkness = darkness + 3;
                    light = light - 3;
                }
                darkness = darkness + 1;
                light = light - 1;
                b6.setVisible(true);
                DarkA.setVisible(false);
                DarkBlast.setVisible(false);
                DarkHex.setVisible(false);
                DarkOverdrive.setVisible(false);
            }
        }
    }

    class OverdriveAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (darkness < 8) {
                message.setText("You lack Dark Energy");
            }
            if (darkness >= 8) {
                message.setText("You have sufficient Dark Energy. \n Using all your dark energy, you bring forth the gates of Hell. \n A Demon's hand gropes out from the gate and grabs the Boss, and his eyes slowly turn black. \n You take a peek in the gate, and see burnt babies and defiled innocents being tortured.");
                bosshp = bosshp - 5000 * darkness;
                darkness = 1;
                light = 1;
                acc = acc + 3;
                critbuff = critbuff + 3;
                attbuff = attbuff + 3;
                poison = poison + 5;
            }
            b6.setVisible(true);
            DarkA.setVisible(false);
            DarkBlast.setVisible(false);
            DarkHex.setVisible(false);
            DarkOverdrive.setVisible(false);
        }
    }

    class Action5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            LightFlash.setVisible(true);
            HeavenBlessing.setVisible(true);
            GodsShield.setVisible(true);
            DivineRetribution.setVisible(true);
            message.setText("Choose a Light Magic Spell");
        }
    }

    class FlashAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            message.setText("You peer deep into the Boss's mind and ignite his confidence. It burns him with rage.");
            double flashdamage = (bosshp / 35) * light;
            bosshp = bosshp - flashdamage;
            darkness = darkness - 1;
            light = light + 1;
            burn = burn + 2;
            b6.setVisible(true);
            LightFlash.setVisible(false);
            HeavenBlessing.setVisible(false);
            GodsShield.setVisible(false);
            DivineRetribution.setVisible(false);
        }
    }

    class BlessAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 1; i++) {
                int Blesschance = (int) (13.0 * Math.random());
                double Blesscrit = Blesschance * critbuff + acc;
                if (Blesscrit <= 2) {
                    message.setText("You accidentally pray to a lesser angel");
                }
                if (Blesscrit > 2 && Blesscrit <= 5) {
                    message.setText("You pray to a powerful angel. He casts a bright light onto you, which you've grown accustomed to. It raises your crit rate");
                    critbuff = critbuff + 2;
                }
                if (Blesscrit > 5 && Blesscrit <= 9) {
                    message.setText("You pray to an archangel. He casts a blinding light onto you, making you harder to hit. It raises your defense and critrate, and lowers the boss's attack");
                    defbuff = defbuff + 2;
                    attbreak = attbreak - 0.25;
                    critbuff = critbuff + 2;
                    darkness = darkness - 1;
                    light = light + 1;
                }
                if (Blesscrit > 9) {
                    message.setText("You pray straight to God Himself. He opens up the clouds and magnifies the Sun's rays, burning the boss. It raises your defense and critrate, and lowers the boss's attack");
                    defbuff = defbuff + 4;
                    attbreak = attbreak - 0.5;
                    burn = burn + 4;
                    critbuff = critbuff + 3;
                    darkness = darkness - 2;
                    light = light + 2;
                }
                darkness = darkness - 1;
                light = light + 1;
                b6.setVisible(true);
                LightFlash.setVisible(false);
                HeavenBlessing.setVisible(false);
                GodsShield.setVisible(false);
                DivineRetribution.setVisible(false);
            }
        }
    }

    class ShieldAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int prochance = (int) (2.0 * Math.random());
            double probepis = (protect *(prochance + 1)) / 3;
            if(probepis >= 1) {
                message.setText("You ask God for a favor. He brings down a shield that blocks the Boss from attacking, and heals you for a small portion of your health. It stuns him");
                stun = stun + 1;
                playerhp = playerhp + 300;
                if(playerhp > 3000){
                    playerhp = 3000;
                }
            }
            if(probepis < 1){
                message.setText("You ask God for a favor. He ignores you since you've been kind of annoying him lately");
                protect = protect + 1;
            }
            darkness = darkness - 1;
            light = light + 1;
            protect = protect - 1;
            b6.setVisible(true);
            LightFlash.setVisible(false);
            HeavenBlessing.setVisible(false);
            GodsShield.setVisible(false);
            DivineRetribution.setVisible(false);
        }
    }

    class DivineAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (light < 8) {
                message.setText("You lack Light energy");
            }
            if (light >= 8) {
                message.setText("You have sufficient Light energy. \n Using all your light energy, you bring forth the gates of Heaven. \n An archangel flies out and thrusts his heavenly sword into the boss, and his mouth starts to foam, his cheeks drained. \n As the archangel leaves, you grab one of his feathers as a take-home gift");
                bosshp = bosshp - 4000 * light;
                light = 1;
                darkness = 1;
                defbuff = defbuff + 4;
                attbreak = attbreak - 0.5;
                burn = burn + 3;
            }
            b6.setVisible(true);
            LightFlash.setVisible(false);
            HeavenBlessing.setVisible(false);
            GodsShield.setVisible(false);
            DivineRetribution.setVisible(false);
        }
    }
}





