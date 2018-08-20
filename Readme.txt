Tema 4 AA

k-colorability
Oricare doua noduri conectate de o muchie trebuie sa aiba culori diferite.Pentru 
fiecare muchie (vi, vj) apartine E, daca vi este colorata cu c, atunci vj nu trebuie
colorata cu c. Clauza (xi,c->~xjc) este echivalenta cu (~xi,cV~xj,c).Pe care o vom 
folosi in transformare. Dimensiunea totala a variabilelor este |V|*k, unde |V| este 
numarul de noduri. Numarul total de clauze este egal cu |V| +|V|*k(k-1)/2 + k|E|,
unde E reprezinta multimea muchilor. 	

Citirea datelor se realizeaza in timp polinomial Theta(m), unde m este numarul de muchii.
Transformarea a fost realizata in clasa ToSat. Prima data calculeaza numarul 
de muchii pentru fiecare nod si-l punem intr-un vector, apoi alegem maximul din vectorul.
Prima operatie se desfasoara in Theta(m) si a doua in Theta(n). Daca maximul este mai mare 
sau egal cu k(numarul de culori), atunci inseamna ca rezultatul  problemei k-colorability 
este 0 si trebuie trimisa in SAT o expresie care calculata, tot timpul trebuie sa dea 0.

Altfel vom construi expresia din trei subparti, folosind formula care determina indicile
varid(i,c,k) = i * k + c, care ne mapeaza uniform nodurile, in functie de culoare.
i-reprezinta nodul, c-culoarea, k-numarul de culori

Pentru prima parte, luam fiecare nod de k ori culori, ii aplicam formula si construim  din 
toate o paranteza , procedeu pe care il repetam pana la epuizare. Procedeul are complexitatea 
Theta(n*k).

Pentru a doua parte, luam fiecare nod, si facem combinari de k luate cate 2 din negatele fiecarei
culori corespunzatoare nodului respectiv. Complexitatea este de Theta(n*k(k-1)/2), 
adica Theata(n*k^2).

In cadrul ultimei parti, o sa luam fiecare muchie si o sa construim pentru aceea muchie atatea 
paranteze cate culori sunt. Termenii din paranteze vor fi negati. In cazul ultimei, parti, vorbim
de o complxitate Theta(m*k).


In concluzie, avem o suma de polinomiale, complexitatea rezultata este tot polinomiala, deci
transformarea este valida.

Realizat de catre: Gengiu Robert
Grupa: 322 CB