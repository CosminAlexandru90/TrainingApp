# 🏃‍♂️ Athlete Performance Tracker

A modern web/mobile app designed to help track, analyze, and optimize training for **masters athletes**, with a focus on **sprint and jump events** (100m, 60m, high jump, long jump, etc.).

Built to integrate data such as sprint splits, RSI tests, jump distances, and strength metrics into one clear performance dashboard.

---

## 🚀 Features

### 🧩 Training Management
- Create and manage **4-week training cycles** with deload weeks.
- Plan sessions for **sprint**, **jump**, **strength**, **speed endurance**, and **mobility** days.
- Tag each workout by focus (CNS load, technical, strength, recovery).

### 🕐 Performance Tracking
- Log key performance data for each session:
  - **Sprint times** (30m, 60m, 100m, 200m, with/without reaction)
  - **RSI tests** (flight time & contact time)
  - **Jumps** (high jump, broad jump, bounds)
  - **Strength metrics** (squat, hang clean, hip thrust, etc.)
- Import or manually enter times measured via **slow-motion video analysis**.

### 📈 Analytics & Insights
- Auto-calculate **speed splits** (acceleration vs top speed).
- Estimate **100m and 200m projections** from 30m/60m runs.
- Track **bodyweight trends** and correlate with sprint performance.
- Generate **force–velocity profile estimates**.
- Visualize **progress graphs** for each metric.

### 💤 Recovery & Readiness
- Track **sleep hours**, **power naps**, and **fatigue scores**.
- Add notes for **muscle tightness or soreness**.
- Get a weekly **recovery load index**.

### 🎯 Goal Tracking
- Define season targets (e.g., “Sub 8.00s 60m”, “1.80m high jump”).
- View predicted progress toward those goals.
- Export summaries for meet preparation or coach feedback.

---

## 📱 Tech Stack

- **Frontend:** React / Next.js + TailwindCSS  
- **Backend:** Node.js (Express) or Python (FastAPI)  
- **Database:** PostgreSQL or Firebase  
- **Auth & Sync:** Firebase Auth or Supabase  
- **Analytics:** Chart.js or Recharts  
- **Optional Mobile Build:** React Native or Expo  

---

## 🧠 Example Use Case

A 35-year-old masters athlete trains in 4-week cycles.  
Each week includes sprint, jump, and strength sessions.  
They record their:
- 30m / 60m times from slow-motion video,
- RSI test before/after sprints,
- Broad jump and bounding results,
- Sleep duration and subjective fatigue.

The app converts these into clear dashboards:
- “Acceleration vs Max Speed” chart
- “RSI over time”
- “Performance readiness score”
- “Predicted 60m / 100m / high jump performance”

---

## 🧩 Future Features

- 📹 **Video timing analysis integration** (automatic frame counting from 240 fps clips)
- 🧠 **AI training recommendations** (based on performance trends)
- 📅 **Meet preparation mode** (taper plans, travel readiness)
- 🧮 **Force–velocity modeling** and jump/sprint power calculators

---

## 🧰 Installation (Developer Setup)

```bash
# Clone repository
git clone https://github.com/yourusername/athlete-performance-tracker.git
cd athlete-performance-tracker

# Install dependencies
npm install

# Run development server
npm run dev
