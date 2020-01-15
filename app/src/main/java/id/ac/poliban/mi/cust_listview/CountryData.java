package id.ac.poliban.mi.cust_listview;

import java.util.ArrayList;
import java.util.List;

public class CountryData {

    static List<Country> getAllCountry(){
        List<Country> data = new ArrayList<>();
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Afghanistan.svg/125px-Flag_of_Afghanistan.svg.png",
                "Afghanistan",
                "Afghanistan (/æfˈɡænɪstæn, æfˈɡɑːnɪstɑːn/ (About this soundlisten); Pashto/Dari: افغانستان, Pashto: Afġānistān [avɣɒnisˈtɒn, ab-],[a] Dari: Afġānestān [avɣɒnesˈtɒn]), officially the Islamic Republic of Afghanistan, is a landlocked country located in South-Central Asia.[10][5][11][12][13]. Afghanistan is bordered by Pakistan to the east and south;[b] Iran to the west; Turkmenistan, Uzbekistan, and Tajikistan to the north; and in the far northeast, China. Occupying 652,000 square kilometers (252,000 sq mi), it is a mountainous country with plains in the north and southwest. Kabul is the capital and largest city. The population is 32 million, mostly composed of ethnic Pashtuns, Tajiks, Hazaras and Uzbeks."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Flag_of_Pakistan.svg/125px-Flag_of_Pakistan.svg.png", "Pakistan", "Pakistan,[b] officially the Islamic Republic of Pakistan,[c] is a country in South Asia. It is the world’s sixth-most populous country with a population exceeding 212.7 million people.[19] In area, it is the 33rd-largest country, spanning 881,913 square kilometres (340,509 square miles). Pakistan has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China in the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the northwest, and also shares a maritime border with Oman."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png", "Indonesia", "Indonesia (/ˌɪndəˈniːʒə/ (About this soundlisten) IN-də-NEE-zhə, /-ˈniːziə/ -\u2060NEE-zee-ə; Indonesian: [ɪndoˈnesia]), officially the Republic of Indonesia (Indonesian: Republik Indonesia [reˈpublik ɪndoˈnesia]),[a] is a country in Southeast Asia, between the Indian and Pacific oceans. It is the world's largest island country, with more than seventeen thousand islands,[11] and at 1,904,569 square kilometres (735,358 square miles), the 14th largest by land area and 7th in the combined sea and land area.[12] With over 261 million people, it is the world's 4th most populous country as well as the most populous Muslim-majority country.[13] Java, the world's most populous island,[14] is home to more than half of the country's population."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/125px-Flag_of_Malaysia.svg.png", "Malaysia","Malaysia (/məˈleɪziə, -ʒə/ (About this soundlisten) mə-LAY-zee-ə, -\u2060zhə; Malay: [məlejsiə]) is a country in Southeast Asia. The federal constitutional monarchy consists of 13 states and three federal territories, separated by the South China Sea into two similarly sized regions, Peninsular Malaysia and East Malaysia (Malaysian Borneo). Peninsular Malaysia shares a land and maritime border with Thailand and maritime borders with Singapore, Vietnam, and Indonesia. East Malaysia shares land and maritime borders with Brunei and Indonesia and a maritime border with the Philippines and Vietnam. Kuala Lumpur is the national capital and largest city while Putrajaya is the seat of the federal government. With a population of over 30 million, Malaysia is the world's 44th most populous country. The southernmost point of continental Eurasia, Tanjung Piai, is in Malaysia. In the tropics, Malaysia is one of 17 megadiverse countries, home to large numbers of endemic species."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/125px-Flag_of_Thailand.svg.png","Thailand","Thailand,[a] officially the Kingdom of Thailand and formerly known as Siam,[b] is a country at the centre of the Southeast Asian Indochinese peninsula composed of 76 provinces. At 513,120 km2 (198,120 sq mi) and over 68 million people, Thailand is the world's 50th-largest country by total area and the 22nd-most-populous country. The capital and largest city is Bangkok, a special administrative area. Thailand is bordered to the north by Myanmar and Laos, to the east by Laos and Cambodia, to the south by the Gulf of Thailand and Malaysia, and to the west by the Andaman Sea and the southern extremity of Myanmar. Its maritime boundaries include Vietnam in the Gulf of Thailand to the southeast, and Indonesia and India on the Andaman Sea to the southwest. It is a unitary state. Although nominally the country is a constitutional monarchy and parliamentary democracy, the most recent coup, in 2014, established a de facto military dictatorship under a junta."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Brunei.svg/125px-Flag_of_Brunei.svg.png","Brunei","Brunei (/bruːˈnaɪ/ (About this soundlisten) broo-NY), officially the Nation of Brunei, the Abode of Peace[10] (Malay: Negara Brunei Darussalam, Jawi: نڬارا بروني دارالسلام\u200E), is a country located on the north coast of the island of Borneo in Southeast Asia. Apart from its coastline with the South China Sea, the country is completely surrounded by the insular Malaysian state of Sarawak. It is separated into two parts by the Sarawak district of Limbang. Brunei is the only sovereign state completely on the island of Borneo; the remainder of the island's territory is divided between the nations of Malaysia and Indonesia. Brunei's population was 423,196 in 2016.[11]"));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Singapore.svg/125px-Flag_of_Singapore.svg.png","Singapore", "Singapore (/ˈsɪŋ(ɡ)əpɔːr/ (About this soundlisten)), officially the Republic of Singapore, is a sovereign island city-state in Southeast Asia. The country is situated one degree (137 kilometres or 85 miles) north of the equator, at the southern tip of the Malay Peninsula, with Indonesia's Riau Islands to the south and Peninsular Malaysia to the north. Singapore's territory consists of one main island along with 62 other islets. Since independence, extensive land reclamation has increased its total size by 23% (130 square kilometres or 50 square miles)."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_the_Philippines.svg/125px-Flag_of_the_Philippines.svg.png", "Philippines", "The Philippines (/ˈfɪləpiːnz/ (About this soundlisten) FIL-ə-peenz; Filipino: Pilipinas [ˌpɪlɪˈpinɐs] or Filipinas [ˌfɪlɪˈpinɐs]), officially the Republic of the Philippines (Filipino: Republika ng Pilipinas),[a] is an archipelagic country in Southeast Asia. Situated in the western Pacific Ocean, it consists of about 7,641 islands[22] that are broadly categorized under three main geographical divisions from north to south: Luzon, Visayas and Mindanao. The capital city of the Philippines is Manila and the most populous city is Quezon City, both part of Metro Manila.[23] Bounded by the South China Sea on the west, the Philippine Sea on the east and the Celebes Sea on the southwest, the Philippines shares maritime borders with Taiwan to the north, Japan to the northeast, Vietnam to the west, Palau to the east, and Malaysia and Indonesia to the south."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/125px-Flag_of_Vietnam.svg.png", "Vietnam", "Vietnam (Vietnamese: Việt Nam pronounced [vîət nāːm] (About this soundlisten)), officially the Socialist Republic of Vietnam (Vietnamese: Cộng hòa xã hội chủ nghĩa Việt Nam), is the easternmost country on the Indochina Peninsula. With an estimated 94.6 million inhabitants as of 2016, it is the 15th most populous country in the world. Vietnam shares its land borders with China to the north, and Laos and Cambodia to the west. It shares its maritime borders with Thailand through the Gulf of Thailand, and the Philippines, Indonesia and Malaysia through the South China Sea.[n 4] Its capital city is Hanoi, while its most populous city is Ho Chi Minh City."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Laos.svg/125px-Flag_of_Laos.svg.png", "Laos", "Laos (/ˈlɑːoʊs/ (About this soundlisten),[8] /laʊs, ˈlɑːɒs, ˈleɪɒs/;[9][10] Lao: ລາວ, Lāo [láːw]), officially the Lao People's Democratic Republic (Lao: ສາທາລະນະລັດ ປະຊາທິປະໄຕ ປະຊາຊົນລາວ, romanized: Saþalanalat Paxaþipatai Paxaxōn Lao; French: République démocratique populaire lao), commonly referred to by its colloquial name of Muang Lao (Lao: ເມືອງລາວ, Muang Lao), is a socialist state and the only landlocked country in Southeast Asia. Located at the heart of the Indochinese peninsula, Laos is bordered by Myanmar (Burma) and China to the northwest, Vietnam to the east, Cambodia to the southeast, and Thailand to the west and southwest"));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_Cambodia.svg/125px-Flag_of_Cambodia.svg.png", "Cambodia", "Cambodia (/kæmˈboʊdiə/ (About this soundlisten);[8] also Kampuchea /ˌkæmpʊˈtʃiːə/; Khmer: កម្ពុជា [kam.pu.ciə]; French: Cambodge), officially the Kingdom of Cambodia (Khmer: ព្រះរាជាណាចក្រកម្ពុជា, prĕəh riəciənaacak kampuciə, IPA: [prĕəh riə.ciə.naː.caʔ kam.pu.ciə]; French: Royaume du Cambodge), is a country located in the southern portion of the Indochina peninsula in Southeast Asia. It is 181,035 square kilometres (69,898 square miles) in area, bordered by Thailand to the northwest, Laos to the northeast, Vietnam to the east and the Gulf of Thailand to the southwest."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Japan%28bordered%29.svg/125px-Flag_of_Japan%28bordered%29.svg.png","Japan","Japan (Japanese: 日本, Nippon [ɲippoꜜɴ] (About this soundlisten) or Nihon [ɲihoꜜɴ] (About this soundlisten); formally 日本国, About this soundNippon-koku or Nihon-koku, lit. 'State of Japan') is an island country in East Asia. Located in the Pacific Ocean, it lies off the eastern coast of the Asian continent and stretches from the Sea of Okhotsk in the north to the East China Sea and the Philippine Sea in the south."));

        return data;
    }

}