# 🤖 Bot de Notificação de Promoções para Telegram

API Rest desenvolvida em Java com Spring Boot para **receber, processar e disparar notificações automáticas de promoções** diretamente para canais e grupos do Telegram.

Este projeto foi construído aplicando os Padrões de Projeto GoF (*Strategy*, *Facade*, *Singleton*) como entrega do bootcamp da **DIO**.

---

## 🛠️ Tecnologias Utilizadas
* **Java 17**
* **Spring Boot 3**
* **Spring Cloud OpenFeign** (Cliente HTTP declarativo para consumo da API do Telegram)
* **Dotenv Java** (Gestão segura de credenciais via variáveis de ambiente)
* **Design Patterns (GoF)**:
  * **Strategy**: Padrão utilizado para abstrair o canal de envio (`TelegramNotificacaoStrategy`), permitindo adicionar novos canais (como WhatsApp ou E-mail) sem alterar a regra de negócio principal.
  * **Facade**: Interface simplificada via REST Controller para acionar o fluxo completo de notificação.

---

## ⚙️ Como Executar o Projeto

### 1. Clonar o repositório
```bash
git clone(https://github.com/duardzx/bot-promocoes-telegram.git)
cd bot-promocoes-telegram
