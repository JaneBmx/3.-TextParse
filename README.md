Information handling light

Cоздать приложение, разбирающее текст из файла и позволяющее выполнять с текстом три различных операции.


Требования:

1. Разобранный текст должен быть представлен в виде объекта, содержащего, например, абзацы, предложения, лексемы, слова, символы. 
Лексема – часть текста, ограниченная пробельными символами. Использовать Composite.  Классы с информацией являются классами сущностей и не должны быть перенагружены 
методами логики.

2. Разобранный текст необходимо восстановить в первоначальном виде. Пробелы и знаки 
табуляции при разборе могут заменяться одним пробелом.

3. Для деления текста на составляющие следует использовать регулярные выражения. 
Регулярные выражения для приложения определять как литеральные константы.  Код, выполняющий разбиение текста на составляющие части, следует оформить в виде 
классов-парсеров с использованием Chain of Responsibility.  При разработке парсеров, разбирающих текст, необходимо следить за количеством 
создаваемых объектов-парсеров.

4. Для записи логов использовать Log4J. 

5. Реализовывать индивидуальные задания по работе над текстом.


Индивидуальные задания

1. Отсортировать абзацы по количеству предложений. 
2. Отсортировать слова в предложении по длине.
3. Отсортировать предложения в абзаце по количеству слов.
